package de.fourtwo.rtfparser.impl.standard;

import de.fourtwo.rtfparser.RtfListener;
import de.fourtwo.rtfparser.RtfCommand;

/**
 * Represents an event to be sent to the listener.
 */
class CommandEvent implements ParserEvent
{
   /**
    * Constructor.
    */
   public CommandEvent(RtfCommand command, int parameter, boolean hasParameter, boolean optional)
   {
      this.command = command;
      this.parameter = parameter;
      this.hasParameter = hasParameter;
      this.optional = optional;
   }

   /**
    * Retrieve the event type.
    */
   @Override
   public ParserEventType getType()
   {
      return ParserEventType.COMMAND_EVENT;
   }

   /**
    * Pass the event to the listener.
    */
   @Override
   public void fire(RtfListener listener)
   {
      listener.processCommand(command, parameter, hasParameter, optional);
   }

   /**
    * Retrieve the command represented by this event.
    */
   public RtfCommand getCommand()
   {
      return command;
   }

   @Override
   public String toString()
   {
      return "[CommandEvent command=" + command + (hasParameter ? " parameter=" + parameter : "") + (optional ? " optional" : "") + "]";
   }

   private final RtfCommand command;
   private final int parameter;
   private final boolean hasParameter;
   private final boolean optional;
}
