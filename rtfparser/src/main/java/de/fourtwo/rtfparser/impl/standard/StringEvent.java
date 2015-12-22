package de.fourtwo.rtfparser.impl.standard;

import de.fourtwo.rtfparser.RtfListener;

/**
 * Represents an event to be sent to the listener.
 */
class StringEvent implements ParserEvent
{
   /**
    * Constructor.
    */
   public StringEvent(String data)
   {
      this.data = data;
   }

   /**
    * Retrieve the event type.
    */
   @Override
   public ParserEventType getType()
   {
      return ParserEventType.STRING_EVENT;
   }

   /**
    * Pass the event to the listener.
    */
   @Override
   public void fire(RtfListener listener)
   {
      listener.processString(data);
   }

   /**
    * Retrieve the string data.
    */
   public String getString()
   {
      return data;
   }

   @Override
   public String toString()
   {
      return "[StringEvent data=" + data + "]";
   }

   private final String data;
}
