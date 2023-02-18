import java.util.*;
public class QuickSort{
 public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the number of names: ");
  int n = sc.nextInt();
  String[] a = new String[n];
  System.out.println("Enter the "+n+" names");
  for (int i=0; i<n; i++){
   a[i] = sc.nextLine();
  }  
  for (int i=0; i<n; i++){
   System.out.println(a[i]+""+i);
  }
  sc.close();
 }
}
