package de.fourtwo.textonlywriter;

import dagger.Module;
import de.fourtwo.rtfparser.RtfSource;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

/**
 * This class implements a trivial RTF to text converter.
 * The extracted text is written to the OutputStream as it is extracted.
 */
@Module
public class TextOnlyStreamWriter extends RtfTextListener {
    private Charset charset;
    private OutputStream os;

    public void write(RtfSource source, OutputStream os, String outputCharsetName) throws IOException {
        this.os = os;
        this.charset = Charset.forName(outputCharsetName);
        super.parse(source);
    }

    protected void processExtractedText(String text) {
        try {
            os.write(text.getBytes(charset));
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
