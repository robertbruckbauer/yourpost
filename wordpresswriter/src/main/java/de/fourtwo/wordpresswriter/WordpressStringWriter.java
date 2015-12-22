package de.fourtwo.wordpresswriter;

import dagger.Module;
import de.fourtwo.rtfparser.RtfCommand;
import de.fourtwo.rtfparser.RtfListener;
import de.fourtwo.rtfparser.RtfParser;
import de.fourtwo.rtfparser.RtfSource;
import de.fourtwo.rtfparser.impl.standard.StandardRtfParser;

import java.io.IOException;

/**
 * This class implements a converter from RTF to a wordpress specific HTML.
 * The extracted content is written to the StringBuilder.
 */
@Module
public class WordpressStringWriter implements RtfListener {

    private StringBuilder buffer;

    public void write(RtfSource source, StringBuilder buffer) throws IOException {
        this.buffer = buffer;
        final RtfParser parser = new StandardRtfParser();
        parser.parse(source, this);
    }

    @Override
    public void processDocumentStart() {

    }

    @Override
    public void processDocumentEnd() {

    }

    @Override
    public void processGroupStart() {

    }

    @Override
    public void processGroupEnd() {

    }

    @Override
    public void processCharacterBytes(byte[] data) {

    }

    @Override
    public void processBinaryBytes(byte[] data) {

    }

    @Override
    public void processString(String string) {

    }

    @Override
    public void processCommand(RtfCommand command, int parameter, boolean hasParameter, boolean optional) {

    }
}
