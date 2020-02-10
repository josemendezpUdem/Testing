import java.io.*;
public class Principal
{
	public static void main(String[] args)
   {
      //Guardo el objeto
      Circulo circulo = new Circulo(5);
      SaveObjects.saveObject(circulo, "circulo.data");
      
      
      //Consigo el objeto
      Circulo circulo2 = (Circulo)SaveObjects.getObject("circulo.data");
      System.out.println(circulo2);

      System.out.println("Adios raza");
      System.out.println("Hola Enrico");
      System.out.println("Hola, Pablo");
	}
}