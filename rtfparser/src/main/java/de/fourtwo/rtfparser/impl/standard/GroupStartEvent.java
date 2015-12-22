package de.fourtwo.rtfparser.impl.standard;

import de.fourtwo.rtfparser.RtfListener;

/**
 * Event represents the start of a group.
 */
class GroupStartEvent implements ParserEvent
{
   /**
    * Pass the event to the listener.
    */
   @Override
   public void fire(RtfListener listener)
   {
      listener.processGroupStart();
   }

   /**
    * Retrieve the event type.
    */
   @Override
   public ParserEventType getType()
   {
      return ParserEventType.GROUP_START_EVENT;
   }

   @Override
   public String toString()
   {
      return "[GroupStartEvent]";
   }
}
