package de.fourtwo.rtfparser.impl.standard;

import de.fourtwo.rtfparser.RtfListener;

/**
 * Event represents the end of a group.
 */
class GroupEndEvent implements ParserEvent
{
   /**
    * Pass the event to the listener.
    */
   @Override
   public void fire(RtfListener listener)
   {
      listener.processGroupEnd();
   }

   /**
    * Retrieve the event type.
    */
   @Override
   public ParserEventType getType()
   {
      return ParserEventType.GROUP_END_EVENT;
   }

   @Override
   public String toString()
   {
      return "[GroupEndEvent]";
   }
}
