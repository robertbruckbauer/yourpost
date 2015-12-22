package de.fourtwo.rtfparser.impl.standard;

import de.fourtwo.rtfparser.RtfListener;

/**
 * Represents an event to be sent to the listener.
 */
class BinaryBytesEvent implements ParserEvent
{
   /**
    * Constructor.
    */
   public BinaryBytesEvent(byte[] data)
   {
      this.data = data;
   }

   /**
    * Retrieve the event type.
    */
   @Override
   public ParserEventType getType()
   {
      return ParserEventType.BINARY_BYTES_EVENT;
   }

   /**
    * Pass the event to the listener.
    */
   @Override
   public void fire(RtfListener listener)
   {
      listener.processBinaryBytes(data);
   }

   @Override
   public String toString()
   {
      return "[BinaryBytesEvent " + data.length + " bytes]";
   }

   private final byte[] data;
}
