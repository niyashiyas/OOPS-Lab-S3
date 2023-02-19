import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class FileException{
 public static void main(String args[]){
  final String path = "Output1.txt";
  FileInputStream fis = null;
  FileOutputStream fout = null;
  try{
   fis = new FileInputStream(path);
   String data = "";
   int ch = fis.read();
   while(ch!=-1){
    data +=  (char)ch;
    ch = fis.read();
   }
   if(data != "")
    System.out.println("String read from file: "+data);
   else
    System.out.println("File is empty");
  }
  catch(FileNotFoundException e){
   System.out.println("Exception as file not found: "+e);
  }
  catch(IOException e){
   System.out.println("Exception: "+e);
  }
  finally{
   try{
    if(fis!=null){
      fis.close();
    }
   }
   catch(IOException e){
    System.out.println(e);
   }
  }
  
  Scanner sc= null;
  try{
   fout = new FileOutputStream(path);
   sc = new Scanner(System.in);
   System.out.println("Enter a string to save in file: ");
   String data = sc.nextLine();
   byte b[] = data.getBytes();
   fout.write(b);
   System.out.print("\""+data+"\""+" written to "+"\""+path+"\""+"\n");
  }
  catch(IOException e){
   System.out.println(e);
  }
  finally{
   if(sc!=null)
    sc.close();
   try{
    if(fout!=null)
     fout.close();
   }
   catch(IOException e){
    System.out.println(e);
   }
  }
 }
}
