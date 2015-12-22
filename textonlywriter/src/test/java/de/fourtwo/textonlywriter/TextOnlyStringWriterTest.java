package de.fourtwo.textonlywriter;

import de.fourtwo.rtfparser.RtfStreamSource;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

import static org.junit.Assert.*;

public class TextOnlyStringWriterTest {

    private TextOnlyStringWriter writer;

    @Before
    public void setUp() throws Exception {
        this.writer = new TextOnlyStringWriter();
    }

    /**
     * Basic test for a rtf file from Google Docs.
     */
    @Test
    public void testConvertHelloDocs() throws Exception {
        String rtf = "/rtf/HelloDocs.rtf";
        InputStream is = getClass().getResourceAsStream(rtf);
        assertNotNull(rtf ,is);

        StringBuilder sb = new StringBuilder();
        writer.write(new RtfStreamSource(is), sb);
        assertEquals(rtf, "Hello Docs!\n", sb.toString());
    }

    /**
     * Basic test for a rtf file from Microsoft Word.
     */
    @Test
    public void testConvertHelloWord() throws Exception {
        String rtf = "/rtf/HelloWord.rtf";
        InputStream is = getClass().getResourceAsStream(rtf);
        assertNotNull(rtf ,is);

        StringBuilder sb = new StringBuilder();
        writer.write(new RtfStreamSource(is), sb);
        assertEquals(rtf, "Hello Word!\n", sb.toString());
    }

    /**
     * test for a rtf file with headlines 1 to 6.
     */
    @Test
    public void testConvertAllHeadline() throws Exception {
        String rtf = "/rtf/AllHeadline.rtf";
        InputStream is = getClass().getResourceAsStream(rtf);
        assertNotNull(rtf, is);

        StringBuilder sb = new StringBuilder();
        writer.write(new RtfStreamSource(is), sb);
        assertTrue(rtf, sb.toString().contains("Headline 1"));
        assertTrue(rtf, sb.toString().contains("Headline 2"));
        assertTrue(rtf, sb.toString().contains("Headline 3"));
        assertTrue(rtf, sb.toString().contains("Headline 4"));
        assertTrue(rtf, sb.toString().contains("Headline 5"));
        assertTrue(rtf, sb.toString().contains("Headline 6"));
    }

    /**
     * test for a rtf file with all german Umlaut.
     */
    @Test
    public void testConvertAllUmlaut() throws Exception {
        String rtf = "/rtf/AllUmlaut.rtf";
        InputStream is = getClass().getResourceAsStream(rtf);
        assertNotNull(rtf ,is);

        StringBuilder sb = new StringBuilder();
        writer.write(new RtfStreamSource(is), sb);
        assertEquals(rtf, "\u00e4\u00c4\n\u00f6\u00d6\n\u00fc\u00dc\n", sb.toString());
    }
}