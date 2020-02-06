import java.io.*;
public class SaveObjects implements Serializable
{
   public static void saveObject(Object obj, String dir)
   {
      File file;
      FileOutputStream fos;
      ObjectOutputStream oos;
		try
      {
   	   file = new File(dir);
            
         if (!file.exists())
         {
   		   file.createNewFile();
         }
         
         fos = new FileOutputStream(file);
         oos = new ObjectOutputStream(fos);
         
         oos.writeObject(obj);
         oos.close();
         fos.close();
      }
      catch (IOException e)
      {
			System.out.println(e.getMessage());
		}
   }
   
   public static Object getObject(String dir)
   {
      File file;
      Object obj = null;
      FileInputStream fis;
      ObjectInputStream ois;
		try
      {
   	   file = new File(dir);

         fis = new FileInputStream(file);
         ois = new ObjectInputStream(fis);
         
         obj = (Object) ois.readObject();
         ois.close();
         fis.close();
      }
      catch (IOException e)
      {
			System.out.println(e.getMessage());
		}
      catch(ClassNotFoundException e)
      {
         System.out.println(e.getMessage());
      }
      return obj;
   }
}