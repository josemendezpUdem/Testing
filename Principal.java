import java.io.*;
public class Principal
{
	public static void main(String[] args)
   {
      System.out.println("Inicio");

   }
   
   public static int multiplicacion (int x, int y)
   {
      float resultado = x*y;

      return resultado;
   }

   public static int division (int x, int y)
   {
      float resultado = x/y;

      return resultado;
   }

   public static int suma (int x, int y)
   {
      float resultado = x+y;

      return resultado;
   }

   public static int resta (int x, int y)
   {
      float resultado = x-y;

      return resultado;
   }
}