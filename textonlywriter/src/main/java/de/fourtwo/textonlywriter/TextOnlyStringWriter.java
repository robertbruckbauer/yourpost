package de.fourtwo.textonlywriter;

import dagger.Module;
import de.fourtwo.rtfparser.RtfSource;

import java.io.IOException;

/**
 * This class implements a trivial RTF to text converter.
 * The extracted text is written to the StringBuilder as it is extracted.
 */
@Module
public class TextOnlyStringWriter extends RtfTextListener {

    private StringBuilder buffer;

    public void write(RtfSource source, StringBuilder buffer) throws IOException {
        this.buffer = buffer;
        super.parse(source);
    }

    protected void processExtractedText(String text) {
        buffer.append(text);
    }
}
