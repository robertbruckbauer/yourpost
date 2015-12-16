package de.fourtwo.rtfparser.impl.standard;

/**
 * A simple "struct" (hence the public members) representing the current state of the parser.
 */
class ParserState
{
   public ParserState()
   {

   }

   public ParserState(ParserState state)
   {
      currentFont = state.currentFont;
      currentEncoding = state.currentEncoding;
      currentFontEncoding = state.currentFontEncoding;
      unicodeAlternateSkipCount = state.unicodeAlternateSkipCount;
   }

   public int currentFont;
   public String currentEncoding;
   public String currentFontEncoding;
   public int unicodeAlternateSkipCount = 1;
}
