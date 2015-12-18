package de.fourtwo.rtfparser;

import dagger.Module;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

/**
 * This class implements a trivial RTF to text converter.
 * The extracted text is written to the OutputStream as it is extracted.
 */
@Module
public class RtfTextStreamConverter extends RtfTextListener {
    private Charset charset;
    private OutputStream os;

    public void convert(RtfSource source, OutputStream os, String outputCharsetName) throws IOException {
        this.os = os;
        this.charset = Charset.forName(outputCharsetName);
        super.convert(source);
    }

    protected void processExtractedText(String text) {
        try {
            os.write(text.getBytes(charset));
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
