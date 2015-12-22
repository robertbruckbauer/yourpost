package de.fourtwo.textonlywriter;

import de.fourtwo.rtfparser.*;
import de.fourtwo.rtfparser.impl.standard.StandardRtfParser;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * This class implements the core of a trivial RTF to text converter.
 * Subclasses implement the processExtractedText method to determine
 * how the extracted text is handled.
 */
public abstract class RtfTextListener implements RtfListener {
    private RtfCommand currentDestination = RtfCommand.rtf;
    private final Deque<RtfCommand> destinationStack = new ArrayDeque<RtfCommand>();

    public void convert(RtfSource source) throws IOException {
        currentDestination = RtfCommand.rtf;
        final RtfParser parser = new StandardRtfParser();
        parser.parse(source, this);
    }

    @Override
    public final void processDocumentStart() {
    }

    @Override
    public final void processDocumentEnd() {
    }


    @Override
    public final void processGroupStart() {
        destinationStack.push(currentDestination);
    }

    @Override
    public final void processGroupEnd() {
        currentDestination = destinationStack.pop();
    }

    @Override
    public final void processString(String string) {
        switch (currentDestination) {
            case rtf:
            case pntext:
            case fldrslt: {
                processExtractedText(string);
                break;
            }

            default: {
                // Do nothing
                break;
            }
        }
    }

    @Override
    public final void processCommand(RtfCommand command, int parameter, boolean hasParameter, boolean optional) {
        if (command.getCommandType() == RtfCommandType.Destination) {
            currentDestination = command;
        }

        switch (command) {
            case par:
            case line:
            case row: {
                processExtractedText("\n");
                break;
            }

            case tab:
            case cell: {
                processExtractedText("\t");
                break;
            }

            default: {
                // Do nothing
                break;
            }
        }
    }

    protected abstract void processExtractedText(String string);

    @Override
    public final void processCharacterBytes(byte[] data) {
    }

    @Override
    public final void processBinaryBytes(byte[] data) {
    }
}
