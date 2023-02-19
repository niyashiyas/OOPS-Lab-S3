import java.util.*;
public class QuickSort{
 void sort(String str[], int low, int high){
	System.out.println("Reached pointed 1");
  if(low<high){
   int p = partition(str, low, high);
	System.out.println("Reached pointed 2");
   sort(str, low, p-1);
   sort(str, p+1, high);
  }
 }

 int partition(String str[], int low, int high){
  String pivot = str[low];  
  int left = low+1, right = high;
	System.out.println("Reached pointed 3");	
  while(left<right){
   while(str[left].compareTo(pivot)<=0){
	System.out.println(str[left]+""+left);
	System.out.println("Reached pointed 4");
    left++;
   }
   while(str[right].compareTo(pivot)>=0){
	System.out.println("Reached pointed 5");
        right--;
   }
   if(str[left].compareTo(str[right])>0){
	System.out.println("Reached pointed 6");
    String temp = str[left];
    str[left] = str[right];
    str[right] = temp;
   }
  }
	System.out.println("Reached pointed 7	");
  str[low]=str[right];
  str[right]= pivot;
  return right;
 }

  void print(String[] a, int n){  
   System.out.println("\nPrinting: ");
   for(int i=0; i<n; i++){
     System.out.println(a[i]);
    }
  }
 
 public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the number of names: ");
  int n = sc.nextInt();
  String[] a = new String[n];
  System.out.println("Enter the "+n+" names");
  for (int i=0; i<n; i++){
   a[i] = sc.next();
  }
  QuickSort obj = new QuickSort();
  obj.print(a,n);
  obj.sort(a,0,n-1);
  obj.print(a,n);
  sc.close();


 }
}
