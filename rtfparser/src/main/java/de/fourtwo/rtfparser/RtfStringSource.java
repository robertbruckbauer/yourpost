package de.fourtwo.rtfparser;

import de.fourtwo.rtfparser.RtfSource;

import java.io.IOException;

/**
 * This is a hack... as a convenience it allows RTF data held in a string
 * to be parsed. The reason it's a hack is that RTF commands are used to
 * manage character encoding, and it's unlikely that the caller handled
 * this when they read the RTF in to the string from its original source.
 * It is also possible for an RTF file to contain raw binary data, which this
 * class will definitely not deal with.
 * <p/>
 * Having said all of that, in the vast majority of cases this approach
 * will work fine. It's also more efficient than creating an InputStream
 * from a String - which usually involves duplicating byte arrays.
 */
public class RtfStringSource implements RtfSource {
    private final String data;
    private int index;

    public RtfStringSource(String data) {
        this.data = data;
    }

    @Override
    public int read() throws IOException {
        int result;

        if (index == data.length()) {
            result = -1;
        } else {
            result = data.charAt(index++);
        }

        return result;
    }

    @Override
    public void unread(int c) throws IOException {
        if (index == 0) {
            throw new IOException("Unread not possible");
        }
        --index;
    }

    @Override
    public int read(byte[] b) throws IOException {
        throw new UnsupportedOperationException();
    }
}
