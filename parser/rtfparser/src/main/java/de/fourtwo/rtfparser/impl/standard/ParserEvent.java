package de.fourtwo.rtfparser.impl.standard;

import de.fourtwo.rtfparser.RtfListener;

/**
 * Represents an event generate by the parser which will at some point
 * in the future be passed to the listener.
 */
interface ParserEvent
{
   /**
    * Retrieve the event type.
    */
   public ParserEventType getType();

   /**
    * Pass this event to the listener.
    */
   public void fire(RtfListener listener);
}
