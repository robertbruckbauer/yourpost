package de.fourtwo.wordpresswriter;

import de.fourtwo.rtfparser.RtfStreamSource;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

import static org.junit.Assert.*;

public class WordpressStringWriterTest {

    private WordpressStringWriter writer;

    @Before
    public void setUp() throws Exception {
        this.writer = new WordpressStringWriter();
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
}