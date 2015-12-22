package de.fourtwo.rtfparser;

import java.io.IOException;

/**
 * Standard interface implemented by an RTF parser.
 */
public interface RtfParser
{
   /**
    * At the point the parser is constructed, a listener will have been
    * supplied by the caller. When this method is called, the parser reads 
    * RTF data from the source and calls the listener with details
    * of the content.
    */
   public void parse(RtfSource source, RtfListener listener) throws IOException;
}
