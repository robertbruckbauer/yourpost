package de.fourtwo.rtfparser.impl.standard;

import de.fourtwo.rtfparser.RtfListener;

/**
 * Event represents the end of a document.
 */
class DocumentEndEvent implements ParserEvent
{
   /**
    * Pass the event to the listener.
    */
   @Override
   public void fire(RtfListener listener)
   {
      listener.processDocumentEnd();
   }

   /**
    * Retrieve the event type.
    */
   @Override
   public ParserEventType getType()
   {
      return ParserEventType.DOCUMENT_END_EVENT;
   }

   @Override
   public String toString()
   {
      return "[DocumentEndEvent]";
   }
}
