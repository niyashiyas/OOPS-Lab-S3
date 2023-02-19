import java.util.Scanner;
public class ExceptionHandling{
 void add(int[] a, int[] b) throws IndexOutOfBoundsException{
  if(a.length!=b.length){
   throw new IndexOutOfBoundsException("Exception occured");	
  }
  else{
   System.out.println("Elements after Addition:");
   for(int i=0; i<a.length; i++){
    System.out.print(a[i]+b[i]);
   }
  }
 }
 public static void main(String args[]){
  Scanner sc= new Scanner(System.in);
  ExceptionHandling eh = new ExceptionHandling();
  System.out.println("Enter number of terms in first matrix: ");
  int n = sc.nextInt();
  System.out.println("Enter number of terms in second matrix: ");
  int m = sc.nextInt();
  int a[] = new int[n];
  int b[] = new int[m];
  System.out.println("Enter elements in first matrix: ");
  for(int i=0; i<n; i++){
   a[i]=sc.nextInt();
  }
  System.out.println("Enter elements in second matrix: ");
  for(int i=0; i<m; i++){
   b[i]=sc.nextInt();
  }
  try{
   eh.add(a,b);
  }
  catch(IndexOutOfBoundsException e){
    System.out.println("Exception: " +e);
  }
  finally{
    System.out.println("Completed program");
  }
 }
}