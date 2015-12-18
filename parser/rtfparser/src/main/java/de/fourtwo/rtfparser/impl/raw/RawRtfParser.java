package de.fourtwo.rtfparser.impl.raw;

import de.fourtwo.rtfparser.RtfCommand;
import de.fourtwo.rtfparser.RtfListener;
import de.fourtwo.rtfparser.RtfParser;
import de.fourtwo.rtfparser.RtfSource;

import java.io.EOFException;
import java.io.IOException;

/**
 * This class implements a low level RTF parser. It performs the minimum amount
 * of processing on the data read from an RTF file, just passing the caller a
 * stream of events representing the commands and character bytes. In particular
 * the parser doesn't not deal with character encodings or the various
 * Unicode related commands which may be present in an RTF file.
 * <p/>
 * This code is based on the approach outlined in the sample C code provided in
 * the RTF Specification 1.9.1 (http://www.microsoft.com/en-gb/download/details.aspx?id=10725)
 */
public class RawRtfParser implements RtfParser {

    private RtfSource source;
    private int groupDepth;
    private boolean parsingHex;
    private ByteBuffer buffer;
    private RtfListener listener;

    private static final int MAX_PARAMETER_LENGTH = 20;
    private static final int MAX_COMMAND_LENGTH = 30;

    /**
     * Parse RTF data from an input source.
     */
    @Override
    public void parse(RtfSource source, RtfListener listener) throws IOException {
        this.source = source;
        this.listener = listener;
        groupDepth = 0;
        parsingHex = false;
        buffer = new ByteBuffer();

        listener.processDocumentStart();

        int ch;
        parsingHex = false;

        while (true) {

            ch = source.read();
            if (ch == -1) {
                break;
            }

            if (groupDepth < 0) {
                throw new IllegalStateException("Group stack underflow");
            }

            switch (ch) {
                case '{': {
                    handleGroupStart();
                    break;
                }

                case '}': {
                    handleGroupEnd();
                    break;
                }

                case '\\': {
                    handleCommand();
                    break;
                }

                case '\r':
                case '\n': {
                    break;
                }

                case '\t': {
                    handleCharacterData();
                    listener.processCommand(RtfCommand.tab, 0, false, false);
                    break;
                }

                default: {
                    handleCharacterByte(ch);
                    break;
                }
            }
        }

        if (groupDepth < 0) {
            throw new IllegalStateException("Group stack underflow");
        }

        if (groupDepth > 0) {
            throw new IllegalStateException("Unmatched brace");
        }

        listener.processDocumentEnd();
    }

    /**
     * Process a single character byte, or hex encoded character byte.
     */
    private void handleCharacterByte(int ch) throws IOException {
        if (parsingHex) {
            int b = HexUtils.parseHexDigit(ch) << 4;
            ch = source.read();
            if (ch == -1) {
                throw new IllegalStateException("Unexpected end of file");
            }
            b += HexUtils.parseHexDigit(ch);
            buffer.add(b);
            parsingHex = false;
        } else {
            buffer.add(ch);
        }
    }

    /**
     * Read and process an RTF command.
     */
    private void handleCommand() throws IOException {
        boolean commandHasParameter = false;
        boolean parameterIsNegative = false;
        int parameterValue = 0;
        StringBuilder commandText = new StringBuilder();
        StringBuilder parameterText = new StringBuilder();

        int ch = source.read();
        if (ch == -1) {
            throw new EOFException();
        }

        commandText.append((char) ch);

        if (!Character.isLetter(ch)) {
            handleCommand(commandText, 0, commandHasParameter);
            return;
        }

        while (true) {
            ch = source.read();
            if (ch == -1 || !Character.isLetter(ch)) {
                break;
            }
            commandText.append((char) ch);
            if (commandText.length() > MAX_COMMAND_LENGTH) {
                break;
            }
        }

        if (ch == -1) {
            throw new EOFException();
        }

        if (commandText.length() > MAX_COMMAND_LENGTH) {
            throw new IllegalArgumentException("Invalid keyword: " + commandText.toString());
        }

        if (ch == '-') {
            parameterIsNegative = true;
            ch = source.read();
            if (ch == -1) {
                throw new EOFException();
            }
        }
        if (Character.isDigit(ch)) {
            commandHasParameter = true;
            parameterText.append((char) ch);
            while (true) {
                ch = source.read();
                if (ch == -1 || !Character.isDigit(ch)) {
                    break;
                }
                parameterText.append((char) ch);
                if (parameterText.length() > MAX_PARAMETER_LENGTH) {
                    break;
                }
            }

            if (parameterText.length() > MAX_PARAMETER_LENGTH) {
                throw new IllegalArgumentException("Invalid parameter: " + parameterText.toString());
            }

            parameterValue = Integer.parseInt(parameterText.toString());
            if (parameterIsNegative) {
                parameterValue = -parameterValue;
            }
        }

        if (ch != ' ') {
            source.unread(ch);
        }

        handleCommand(commandText, parameterValue, commandHasParameter);
    }

    /**
     * Determine what to do with the extracted command.
     */
    private void handleCommand(StringBuilder commandBuffer, int parameter, boolean hasParameter) throws IOException {
        String commandName = commandBuffer.toString();
        RtfCommand command = RtfCommand.getInstance(commandName);

        //
        // Note that we silently ignore commands that we don't recognise
        //
        if (command != null) {
            if (command != RtfCommand.hex) {
                handleCharacterData();
            }

            switch (command) {
                case bin: {
                    handleBinaryData(parameter);
                    break;
                }

                case hex: {
                    parsingHex = true;
                    break;
                }

                default: {
                    listener.processCommand(command, parameter, hasParameter, false);
                    break;
                }
            }
        }
    }

    /**
     * Pass accumulated character data to the listener.
     */
    private void handleCharacterData() {
        byte[] data = buffer.toArray();
        buffer.clear();
        listener.processCharacterBytes(data);
    }

    /**
     * Pass binary data to the listener.
     */
    private void handleBinaryData(int size) throws IOException {
        byte[] data = new byte[size];
        int bytesRead = source.read(data);
        if (bytesRead != size) {
            throw new EOFException();
        }
        listener.processBinaryBytes(data);
    }

    /**
     * Inform the listener of a group start.
     */
    private void handleGroupStart() {
        handleCharacterData();
        groupDepth++;
        listener.processGroupStart();
    }

    /**
     * Inform the listener of a group end.
     */
    private void handleGroupEnd() {
        handleCharacterData();
        listener.processGroupEnd();
        groupDepth--;
    }
}
