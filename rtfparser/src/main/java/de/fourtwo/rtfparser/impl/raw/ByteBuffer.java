package de.fourtwo.rtfparser.impl.raw;

/**
 * Implements a simple byte array based buffer. Used to collect
 * data one byte at a time into a buffer, then pass the
 * collected data to the caller as an array.
 */
class ByteBuffer
{
   /**
    * Add a byte to the buffer.
    */
   public void add(int b)
   {
      if (bufferSize == buffer.length)
      {
         byte[] newBuffer = new byte[buffer.length + (buffer.length >> 1)];
         System.arraycopy(buffer, 0, newBuffer, 0, bufferSize);
         buffer = newBuffer;
      }

      buffer[bufferSize++] = (byte) b;
   }

   /**
    * Clear the buffer.
    */
   public void clear()
   {
      bufferSize = 0;
   }

   /**
    * Return the buffer as an array.
    */
   public byte[] toArray()
   {
      byte[] result = new byte[bufferSize];
      System.arraycopy(buffer, 0, result, 0, bufferSize);
      return result;
   }

   /**
    * Determines if the buffer is empty.
    */
   public boolean isEmpty()
   {
      return bufferSize == 0;
   }

   @Override
   public String toString()
   {
      return "[ByteBuffer bufferSize=" + bufferSize + " buffer=" + new String(buffer, 0, bufferSize) + "]";
   }

   private static final int INITIAL_BUFFER_CAPACITY = 10240;
   private int bufferSize;
   private byte[] buffer = new byte[INITIAL_BUFFER_CAPACITY];
}
