package de.fourtwo.rtfparser;

import de.fourtwo.rtfparser.RtfSource;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Implementation of RtfSource which will read the RTF file from a stream.
 */
public class RtfStreamSource implements RtfSource {
    private final InputStream stream;
    private int pushBackChar = -1;

    public RtfStreamSource(InputStream stream) {
        if (stream instanceof BufferedInputStream) {
            this.stream = stream;
        } else {
            this.stream = new BufferedInputStream(stream);
        }
    }

    @Override
    public int read() throws IOException {
        int result;

        if (pushBackChar != -1) {
            result = pushBackChar;
            pushBackChar = -1;
        } else {
            result = stream.read();
        }

        return result;
    }

    @Override
    public void unread(int c) throws IOException {
        if (pushBackChar != -1) {
            throw new IOException("Unread not possible");
        }

        pushBackChar = c;
    }

    @Override
    public int read(byte[] b) throws IOException {
        return stream.read(b);
    }
}
