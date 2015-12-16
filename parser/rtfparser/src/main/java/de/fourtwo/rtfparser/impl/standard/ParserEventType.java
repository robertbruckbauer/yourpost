package de.fourtwo.rtfparser.impl.standard;

/**
 * Types of event which may be raised by the parser.
 */
enum ParserEventType
{
   BINARY_BYTES_EVENT, COMMAND_EVENT, DOCUMENT_END_EVENT, DOCUMENT_START_EVENT, GROUP_END_EVENT, GROUP_START_EVENT, STRING_EVENT;
}
