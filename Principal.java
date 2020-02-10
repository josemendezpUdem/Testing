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
               break;
            case 2:
               System.out.println("Restar");
               break;
            case 3:
               System.out.println("Multiplicar");
               break;
            case 4:
               System.out.println("Dividir");
               break;
         }
      }
      while(opcion <= 0 || opcion >= 5);    
   }
}