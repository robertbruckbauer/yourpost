package de.fourtwo.rtfparser;

import java.io.IOException;

import de.fourtwo.rtfparser.RtfSource;
import de.fourtwo.rtfparser.RtfTextListener;

/**
 * This class implements a trivial RTF to text converter.
 * The extracted text is written to the StringBuilder as it is extracted.
 */
public class RtfTextStringConverter extends RtfTextListener {
    private StringBuilder buffer;

    public void convert(RtfSource source, StringBuilder buffer) throws IOException {
        this.buffer = buffer;
        super.convert(source);
    }

    protected void processExtractedText(String text) {
        buffer.append(text);
    }
}
