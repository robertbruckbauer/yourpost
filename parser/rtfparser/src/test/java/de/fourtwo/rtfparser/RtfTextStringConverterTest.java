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

}