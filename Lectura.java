import java.io.*;
class Lectura
{
   //BYTE
   public static byte readByte()
   {
      DataInputStream input = new DataInputStream(System.in);
      byte value = 0;
      boolean sw = false;
      do
      {
         sw = false;
         try
         {
            value = Byte.parseByte(input.readLine());
         }
         catch(NumberFormatException e)
         {
            System.out.println("No es un formato valido para un byte");
            sw = true;
         }
         catch (IOException e)
         {
            System.out.println("Error: " + e.getMessage());
            sw = true;
         }
      }
      while (sw != false);
      return value; 
   }
   
   public static byte readByte(String message)
   {
      DataInputStream input =new DataInputStream(System.in);
      byte value = 0;
      boolean sw = false;
      do
      {
         System.out.println(message);
         sw = false;
         try
         {
            value = Byte.parseByte(input.readLine());
         }
         catch(NumberFormatException e)
         {
            System.out.println("No es un formato valido para un byte");
            sw = true;
         }
         catch (IOException e)
         {
            System.out.println("Error: " + e.getMessage());
            sw = true;
         }
      }
      while (sw != false);
      return value; 
   }
   
   public static byte readByte(byte min, byte max)
   {
      DataInputStream input =new DataInputStream(System.in);
      byte value = 0;
      boolean sw = false;
      do
      {
         sw = false;
         try
         {
            value = Byte.parseByte(input.readLine());
         }
         catch(NumberFormatException e)
         {
            System.out.println("No es un formato valido para un byte");
            sw = true;
         }
         catch (IOException e)
         {
            System.out.println("Error: " + e.getMessage());
            sw = true;
         }
         finally
         {
            if(value >= min && value <= max)
            {
               sw = false;
            }
            else
            {
               sw = true;
            }
         }
      }
      while (sw != false);
      return value; 
   }
   
   public static byte readByte(byte min, byte max, String message)
   {
      DataInputStream input = new DataInputStream(System.in);
      byte value = 0;
      boolean sw = false;
      do
      {
         System.out.println(message);
         sw = false;
         try
         {
            value = Byte.parseByte(input.readLine());
         }
         catch(NumberFormatException e)
         {
            System.out.println("No es un formato valido para un byte");
            sw = true;
         }
         catch (IOException e)
         {
            System.out.println("Error: " + e.getMessage());
            sw = true;
         }
         finally
         {
            if(value >= min && value <= max)
            {
               sw = false;
            }
            else
            {
               sw = true;
            }
         }
      }
      while (sw != false);
      return value; 
   }

   //SHORT
   public static int  readShort()
   {
      DataInputStream input = new DataInputStream(System.in);
      int value = 0;
      boolean sw = false;
      do
      {
         sw = false;
         try
         {
            value = Short.parseShort(input.readLine());
         }
         catch(NumberFormatException e)
         {
            System.out.println("No es un formato valido para un short");
            sw = true;
         }
         catch (IOException e)
         {
            System.out.println("Error: " + e.getMessage());
            sw = true;
         }
      }
      while (sw != false);
      return value; 
   }
   
   public static int  readShort(String message)
   {
      DataInputStream input =new DataInputStream(System.in);
      int value = 0;
      boolean sw = false;
      do
      {
         System.out.println(message);
         sw = false;
         try
         {
            value = Short.parseShort(input.readLine());
         }
         catch(NumberFormatException e)
         {
            System.out.println("No es un formato valido para un short");
            sw = true;
         }
         catch (IOException e)
         {
            System.out.println("Error: " + e.getMessage());
            sw = true;
         }
      }
      while (sw != false);
      return value; 
   }
   
   public static short readShort(short min, short max)
   {
      DataInputStream input =new DataInputStream(System.in);
      short value = 0;
      boolean sw = false;
      do
      {
         sw = false;
         try
         {
            value = Short.parseShort(input.readLine());
         }
         catch(NumberFormatException e)
         {
            System.out.println("No es un formato valido para un short");
            sw = true;
         }
         catch (IOException e)
         {
            System.out.println("Error: " + e.getMessage());
            sw = true;
         }
         finally
         {
            if(value >= min && value <= max)
            {
               sw = false;
            }
            else
            {
               sw = true;
            }
         }
      }
      while (sw != false);
      return value; 
   }
   
   public static short readShort(short min, short max, String message)
   {
      DataInputStream input =new DataInputStream(System.in);
      short value = 0;
      boolean sw = false;
      do
      {
         System.out.println(message);
         sw = false;
         try
         {
            value = Short.parseShort(input.readLine());
         }
         catch(NumberFormatException e)
         {
            System.out.println("No es un formato valido para un short");
            sw = true;
         }
         catch (IOException e)
         {
            System.out.println("Error: " + e.getMessage());
            sw = true;
         }
         finally
         {
            if(value >= min && value <= max)
            {
               sw = false;
            }
            else
            {
               sw = true;
            }
         }
      }
      while (sw != false);
      return value; 
   }

   //INTEGER
   public static int readInt()
   {
      DataInputStream input =new DataInputStream(System.in);
      int value = 0;
      boolean sw = false;
      do
      {
         sw = false;
         try
         {
            value = Integer.parseInt(input.readLine());
         }
         catch(NumberFormatException e)
         {
            System.out.println("No es un formato valido para un int");
            sw = true;
         }
         catch (IOException e)
         {
            System.out.println("Error: " + e.getMessage());
            sw = true;
         }
      }
      while (sw != false);
      return value; 
   }
   
   public static int  readInt(String message)
   {
      DataInputStream input =new DataInputStream(System.in);
      int value = 0;
      boolean sw = false;
      do
      {
         System.out.println(message);
         sw = false;
         try
         {
            value = Integer.parseInt(input.readLine());
         }
         catch(NumberFormatException e)
         {
            System.out.println("No es un formato valido para un int");
            sw = true;
         }
         catch (IOException e)
         {
            System.out.println("Error: " + e.getMessage());
            sw = true;
         }
      }
      while (sw != false);
      return value; 
   }
   
   public static int  readInt(int min, int max)
   {
      DataInputStream input =new DataInputStream(System.in);
      int value = 0;
      boolean sw = false;
      do
      {
         sw = false;
         try
         {
            value = Integer.parseInt(input.readLine());
         }
         catch(NumberFormatException e)
         {
            System.out.println("No es un formato valido para un int");
            sw = true;
         }
         catch (IOException e)
         {
            System.out.println("Error: " + e.getMessage());
            sw = true;
         }
         finally
         {
            if(value >= min && value <= max)
            {
               sw = false;
            }
            else
            {
               sw = true;
            }
         }
      }
      while (sw != false);
      return value; 
   }
   
   public static int  readInt(int min, int max, String message)
   {
      DataInputStream input =new DataInputStream(System.in);
      int value = 0;
      boolean sw = false;
      do
      {
         System.out.println(message);
         sw = false;
         try
         {
            value = Integer.parseInt(input.readLine());
         }
         catch(NumberFormatException e)
         {
            System.out.println("No es un formato valido para un int");
            sw = true;
         }
         catch (IOException e)
         {
            System.out.println("Error: " + e.getMessage());
            sw = true;
         }
         finally
         {
            if(value >= min && value <= max)
            {
               sw = false;
            }
            else
            {
               sw = true;
            }
         }
      }
      while (sw != false);
      return value; 
   }
   
   //LONG
   public static long readLong()
   {
      DataInputStream input = new DataInputStream(System.in);
      long value = 0;
      boolean sw = false;
      do
      {
         sw = false;
         try
         {
            value = Long.parseLong(input.readLine());
         }
         catch(NumberFormatException e)
         {
            System.out.println("No es un formato valido para un long");
            sw = true;
         }
         catch (IOException e)
         {
            System.out.println("Error: " + e.getMessage());
            sw = true;
         }
      }
      while (sw != false);
      return value; 
   }
   
   public static long  readLong(String message)
   {
      DataInputStream input =new DataInputStream(System.in);
      long value = 0;
      boolean sw = false;
      do
      {
         System.out.println(message);
         sw = false;
         try
         {
            value = Long.parseLong(input.readLine());
         }
         catch(NumberFormatException e)
         {
            System.out.println("No es un formato valido para un long");
            sw = true;
         }
         catch (IOException e)
         {
            System.out.println("Error: " + e.getMessage());
            sw = true;
         }
      }
      while (sw != false);
      return value; 
   }
   
   public static long  readLong(long min, long max)
   {
      DataInputStream input =new DataInputStream(System.in);
      long value = 0;
      boolean sw = false;
      do
      {
         sw = false;
         try
         {
            value = Long.parseLong(input.readLine());
         }
         catch(NumberFormatException e)
         {
            System.out.println("No es un formato valido para un long");
            sw = true;
         }
         catch (IOException e)
         {
            System.out.println("Error: " + e.getMessage());
            sw = true;
         }
         finally
         {
            if(value >= min && value <= max)
            {
               sw = false;
            }
            else
            {
               sw = true;
            }
         }
      }
      while (sw != false);
      return value; 
   }
   
   public static long  readLong(long min, long max, String message)
   {
      DataInputStream input =new DataInputStream(System.in);
      long value = 0;
      boolean sw = false;
      do
      {
         System.out.println(message);
         sw = false;
         try
         {
            value = Long.parseLong(input.readLine());
         }
         catch(NumberFormatException e)
         {
            System.out.println("No es un formato valido para un long");
            sw = true;
         }
         catch (IOException e)
         {
            System.out.println("Error: " + e.getMessage());
            sw = true;
         }
         finally
         {
            if(value >= min && value <= max)
            {
               sw = false;
            }
            else
            {
               sw = true;
            }
         }
      }
      while (sw != false);
      return value; 
   }

   //FLOAT
   public static float readFloat()
   {
      DataInputStream input = new DataInputStream(System.in);
      float value = 0;
      boolean sw = false;
      do
      {
         sw = false;
         try
         {
            value = Float.parseFloat(input.readLine());
         }
         catch(NumberFormatException e)
         {
            System.out.println("No es un formato valido para un float");
            sw = true;
         }
         catch (IOException e)
         {
            System.out.println("Error: " + e.getMessage());
            sw = true;
         }
      }
      while (sw != false);
      return value; 
   }
   
   public static float readFloat(String message)
   {
      DataInputStream input =new DataInputStream(System.in);
      float value = 0;
      boolean sw = false;
      do
      {
         System.out.println(message);
         sw = false;
         try
         {
            value = Float.parseFloat(input.readLine());
         }
         catch(NumberFormatException e)
         {
            System.out.println("No es un formato valido para un float");
            sw = true;
         }
         catch (IOException e)
         {
            System.out.println("Error: " + e.getMessage());
            sw = true;
         }
      }
      while (sw != false);
      return value; 
   }
   
   public static float readFloat(float min, float max)
   {
      DataInputStream input =new DataInputStream(System.in);
      float value = 0;
      boolean sw = false;
      do
      {
         sw = false;
         try
         {
            value = Float.parseFloat(input.readLine());
         }
         catch(NumberFormatException e)
         {
            System.out.println("No es un formato valido para un float");
            sw = true;
         }
         catch (IOException e)
         {
            System.out.println("Error: " + e.getMessage());
            sw = true;
         }
         finally
         {
            if(value >= min && value <= max)
            {
               sw = false;
            }
            else
            {
               sw = true;
            }
         }
      }
      while (sw != false);
      return value; 
   }
   
   public static float readFloat(float min, float max, String message)
   {
      DataInputStream input =new DataInputStream(System.in);
      float value = 0;
      boolean sw = false;
      do
      {
         System.out.println(message);
         sw = false;
         try
         {
            value = Float.parseFloat(input.readLine());
         }
         catch(NumberFormatException e)
         {
            System.out.println("No es un formato valido para un float");
            sw = true;
         }
         catch (IOException e)
         {
            System.out.println("Error: " + e.getMessage());
            sw = true;
         }
         finally
         {
            if(value >= min && value <= max)
            {
               sw = false;
            }
            else
            {
               sw = true;
            }
         }
      }
      while (sw != false);
      return value; 
   }
   
   //DOUBLE
   public static double readDouble()
   {
      DataInputStream input = new DataInputStream(System.in);
      double value = 0;
      boolean sw = false;
      do
      {
         sw = false;
         try
         {
            value = Double.parseDouble(input.readLine());
         }
         catch(NumberFormatException e)
         {
            System.out.println("No es un formato valido para un double");
            sw = true;
         }
         catch (IOException e)
         {
            System.out.println("Error: " + e.getMessage());
            sw = true;
         }
      }
      while (sw != false);
      return value; 
   }
   
   public static double readDouble(String message)
   {
      DataInputStream input =new DataInputStream(System.in);
      double value = 0;
      boolean sw = false;
      do
      {
         System.out.println(message);
         sw = false;
         try
         {
            value = Double.parseDouble(input.readLine());
         }
         catch(NumberFormatException e)
         {
            System.out.println("No es un formato valido para un double");
            sw = true;
         }
         catch (IOException e)
         {
            System.out.println("Error: " + e.getMessage());
            sw = true;
         }
      }
      while (sw != false);
      return value; 
   }
   
   public static double readDouble(double min, double max)
   {
      DataInputStream input =new DataInputStream(System.in);
      double value = 0;
      boolean sw = false;
      do
      {
         sw = false;
         try
         {
            value = Double.parseDouble(input.readLine());
         }
         catch(NumberFormatException e)
         {
            System.out.println("No es un formato valido para un double");
            sw = true;
         }
         catch (IOException e)
         {
            System.out.println("Error: " + e.getMessage());
            sw = true;
         }
         finally
         {
            if(value >= min && value <= max)
            {
               sw = false;
            }
            else
            {
               sw = true;
            }
         }
      }
      while (sw != false);
      return value; 
   }
   
   public static double readDouble(double min, double max, String message)
   {
      DataInputStream input =new DataInputStream(System.in);
      double value = 0;
      boolean sw = false;
      do
      {
         System.out.println(message);
         sw = false;
         try
         {
            value = Double.parseDouble(input.readLine());
         }
         catch(NumberFormatException e)
         {
            System.out.println("No es un formato valido para un double");
            sw = true;
         }
         catch (IOException e)
         {
            System.out.println("Error: " + e.getMessage());
            sw = true;
         }
         finally
         {
            if(value >= min && value <= max)
            {
               sw = false;
            }
            else
            {
               sw = true;
            }
         }
      }
      while (sw != false);
      return value; 
   }
   
   //STRING
   public static String readString()
   {
      DataInputStream input = new DataInputStream(System.in);
      String value = "";
      boolean sw = false;
      do
      {
         sw = false;
         try
         {
            value = input.readLine();
         }
         catch(NumberFormatException e)
         {
            System.out.println("No es un formato valido para un String");
            sw = true;
         }
         catch (IOException e)
         {
            System.out.println("Error: " + e.getMessage());
            sw = true;
         }
      }
      while (sw != false);
      return value; 
   }
   
   public static String readString(String message)
   {
      DataInputStream input = new DataInputStream(System.in);
      String value = "";
      boolean sw = false;
      do
      {
         System.out.println(message);
         sw = false;
         try
         {
            value = input.readLine();
         }
         catch(NumberFormatException e)
         {
            System.out.println("No es un formato valido para un String");
            sw = true;
         }
         catch (IOException e)
         {
            System.out.println("Error: " + e.getMessage());
            sw = true;
         }
      }
      while (sw != false);
      return value; 
   }
   
   //CHAR
   public static char readChar()
   {
      DataInputStream input = new DataInputStream(System.in);
      char value = 127;
      boolean sw = false;
      do
      {
         sw = false;
         try
         {
            value = input.readLine().charAt(0);
         }
         catch(NumberFormatException e)
         {
            System.out.println("No es un formato valido para un char");
            sw = true;
         }
         catch (IOException e)
         {
            System.out.println("Error: " + e.getMessage());
            sw = true;
         }
      }
      while (sw != false);
      return value; 
   }
   
   public static char readChar(String message)
   {
      DataInputStream input = new DataInputStream(System.in);
      char value = 127;
      boolean sw = false;
      do
      {
         System.out.println(message);
         sw = false;
         try
         {
            value = input.readLine().charAt(0);
         }
         catch(NumberFormatException e)
         {
            System.out.println("No es un formato valido para un char");
            sw = true;
         }
         catch (IOException e)
         {
            System.out.println("Error: " + e.getMessage());
            sw = true;
         }
      }
      while (sw != false);
      return value; 
   }  
}