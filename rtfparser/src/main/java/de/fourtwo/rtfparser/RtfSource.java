package de.fourtwo.rtfparser;

import java.io.IOException;

/**
 * Classes implementing this interface can be used as the source of RTF data for the parser to consume.
 */
public interface RtfSource
{
   /**
    * Read a single byte.
    */
   int read() throws IOException;

   /**
    * Push back a single byte to allow it to be read again by the parser.
    */
   void unread(int c) throws IOException;

   /**
    * Read enough bytes to fill the array.
    */
   int read(byte[] b) throws IOException;
}
