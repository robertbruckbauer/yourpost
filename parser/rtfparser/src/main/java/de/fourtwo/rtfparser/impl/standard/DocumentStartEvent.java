package de.fourtwo.rtfparser.impl.standard;

import de.fourtwo.rtfparser.RtfListener;

/**
 * Event represents the start of a document.
 */
class DocumentStartEvent implements ParserEvent
{
   /**
    * Pass the event to the listener.
    */
   @Override
   public void fire(RtfListener listener)
   {
      listener.processDocumentStart();
   }

   /**
    * Retrieve the event type.
    */
   @Override
   public ParserEventType getType()
   {
      return ParserEventType.DOCUMENT_START_EVENT;
   }

   @Override
   public String toString()
   {
      return "[DocumentStartEvent]";
   }
}
