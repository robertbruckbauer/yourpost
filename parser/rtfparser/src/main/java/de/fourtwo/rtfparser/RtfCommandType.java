package de.fourtwo.rtfparser;

/**
 * Enumeration of command types. See Appendix B of the RTF specification.
 */
public enum RtfCommandType
{
   Symbol, // This control word represents a special character 
   Flag, // This control word ignores any parameter.
   Toggle, // This control word distinguishes between the ON and OFF states for the given property
   Value, // This control word requires a parameter.
   Destination, // This control word starts a group or destination. It ignores any parameter. 
   Encoding; // Switch the character encoding used from this point in the document
}
