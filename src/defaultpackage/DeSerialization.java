package defaultpackage;
import java.util.*;
import java.io.*;
 public class DeSerialization {
    public static void main(String args[]) {
    
       ArrayList<String> arraylist= new ArrayList<String>();
        try
        {
            FileInputStream fis = new FileInputStream("D:\\inputfile.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            arraylist = (ArrayList) ois.readObject();
            ois.close();
            fis.close();
         }catch(IOException ioe){
             ioe.printStackTrace();
             return;
          }catch(ClassNotFoundException c){
             System.out.println("Class not found");
             c.printStackTrace();
             return;
          }
        for(String str: arraylist){
            System.out.println(str);
        }
  }
}