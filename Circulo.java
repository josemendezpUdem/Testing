import java.io.*;

public class Circulo implements Serializable
{
   private float radio;
   public Circulo(float radio)
   {
      this.radio = radio;
   }
   
   public double getArea()
   {
      return Math.PI * Math.pow(radio ,2);
   }
   
   public String toString()
   {
      return getArea() + "";
   }
}