import java.util.*;
public class BinarySearch{
 void search(int[] arr, int key, int low, int high){
  int flag = 1;
  while(low<high){
   int mid = (high+low)/2;
   if(arr[mid]>key){
    high=mid-1;
   }
   else if(arr[mid]<key){
    low=mid+1;
   }
   else{
    System.out.println("Element found at position: "+ (mid+1));
    flag=0;
    break;	
   }
  }
  if(flag==1){
   System.out.println("Element not found");
  }
 }


 public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the number of digits: ");
  int n =sc.nextInt();   
  int[] arr = new int[n];
  System.out.println("Enter the digits");
  for(int i=0; i<n; i++){
   arr[i] = sc.nextInt();
  }  
  System.out.println("Enter the key to be searched: ");
  int key =sc.nextInt(); 
  Arrays.sort(arr);
  BinarySearch obj = new BinarySearch();
  obj.search(arr, key, 0, n-1);
 }
}