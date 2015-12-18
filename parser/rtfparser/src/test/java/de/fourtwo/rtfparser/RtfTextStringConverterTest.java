package de.fourtwo.rtfparser;

import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import static org.junit.Assert.*;

public class RtfTextStringConverterTest {

    private RtfTextStringConverter converter;

    @Before
    public void setUp() throws Exception {
        this.converter = new RtfTextStringConverter();
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
        converter.convert(new RtfStreamSource(is), sb);
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
        converter.convert(new RtfStreamSource(is), sb);
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
        converter.convert(new RtfStreamSource(is), sb);
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
        converter.convert(new RtfStreamSource(is), sb);
        assertEquals(rtf, "äÄ\nöÖ\nüÜ\n", sb.toString());
    }
}