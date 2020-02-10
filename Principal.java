import java.io.*;
public class Principal
{
	public static void main(String[] args)
   {
      menu();
	}

   public static void menu()
   {
      System.out.println("Inicio");
      int opcion = 0;
      do
      {
         System.out.println("[1]\tSumar");
         System.out.println("[2]\tRestar");
         System.out.println("[3]\tMultiplicar");
         System.out.println("[4]\tDividir");
         
         opcion = Lectura.readInt();
         
         switch(opcion)
         {
            case 1:
               System.out.println("Sumar");
               System.out.println(suma(Lectura.readFloat("Ingresar Numero"), Lectura.readFloat("Ingresar Numero")));
               break;
            case 2:
               System.out.println("Restar");
               System.out.println(resta(Lectura.readFloat("Ingresar Numero"), Lectura.readFloat("Ingresar Numero")));
               break;
            case 3:
               System.out.println("Multiplicar");
               System.out.println(multiplicacion(Lectura.readFloat("Ingresar Numero"), Lectura.readFloat("Ingresar Numero")));
               break;
            case 4:
               System.out.println("Dividir");
               System.out.println(division(Lectura.readFloat("Ingresar Numero"), Lectura.readFloat("Ingresar Numero")));
               break;
         }
      }
      while(opcion <= 0 || opcion >= 5);    
      System.out.println("Inicio");

   }
   
   public static float multiplicacion (float x, float y)
   {
      float resultado = x*y;

      return resultado;
   }

   public static float division (float x, float y)
   {
      float resultado = x/y;

      return resultado;
   }

   public static float suma (float x, float y)
   {
      float resultado = x+y;

      return resultado;
   }

   public static float resta (float x, float y)
   {
      float resultado = x-y;

      return resultado;
   }
}