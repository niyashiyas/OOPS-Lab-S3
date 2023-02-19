import java.util.*;
public class StringTokeniser{
 public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the numbers as a string seperated by a comma");
  String str = sc.nextLine();
  StringTokenizer str1 = new StringTokenizer(str,",");
  int sum=0;
  while(str1.hasMoreTokens()){
   int num = Integer.parseInt(str1.nextToken());
   sum+=num;
  }
  System.out.println("Sum is: "+sum);
 } 
}