import java.util.*;
 public class DLL{
  class Node{
   int data;
   Node next;
   Node prev;
   Node(int data){
    this.data=data;
   }
 } 
  public Node head = null;
  public Node tail = null;

//Insertion
 public void insert(int data){
  if(head==null){
    Node newNode = new Node(data);
    head = newNode;
    tail = newNode;
  }
  else{
   Node newNode = new Node(data);
   tail.next = newNode;
   newNode.prev = tail;
   tail = newNode;
  }
 }

//Insertion After Position
 public void insertAfter(int num, int data){
  Node newNode = new Node(data);
  Node temp = head;
  while(temp != null && temp.data != num){
   temp = temp.next;
  }
  if(temp==null){
   System.out.println("\nError, Element: "+num +" not found");
  }
  else if(temp==tail){
   tail.next=newNode;
   tail = newNode;
  }
  else{
   Node next = temp.next;
   temp.next = newNode;
   newNode.prev = temp;
   newNode.next = next;
   next.prev = newNode;
  }
 }


//Deletion
 public void delete(int data){
  Node temp = head;
  while(temp != null && temp.data != data){
   temp = temp.next;
  }
  if(temp==head){
   head = head.next;
  }
  else if(temp==null){
   System.out.println("Error: Element not found");
  }
 else if(temp == tail){
  tail = tail.prev;
  tail.next = null; 	
 }

  else{
  Node prev = temp.prev;
  Node next = temp.next;
  prev.next = temp.next;
  next.prev = temp.prev;	 
 }
}

//Display 
 public void display(){
  Node temp = head;
  if(head == null){
   System.out.println("Nothing to display");
  }
  else{
   while(temp != null){
    System.out.print(temp.data+" <-> ");
    temp = temp.next;
   }
  }
 }
 
 public static void main(String args[]){
  DLL list = new DLL();
  Scanner sc = new Scanner(System.in);
  int flag= 0;
  while(flag==0){
   System.out.println("\n1)For adding element \n2)For Displaying \n3)For Deleting element \n4)For Inserting After \n5)Exit");
   int choice = sc.nextInt();
   switch(choice){
    case 1:
     System.out.println("Enter the element to insert: ");
     int data = sc.nextInt();
     list.insert(data);
     break;
    
    case 2:
     list.display();
     break;
    
    case 3:
     System.out.println("Enter the element to delete");
     data = sc.nextInt();
     list.delete(data);
     break;
    
    case 4:
     System.out.println("Enter the element after which to insert: ");
     int num = sc.nextInt();
     System.out.println("Enter the element to insert: ");
     data = sc.nextInt();
     list.insertAfter(num,data);
     break;

   case 5:
     flag = 1;
     break;
   
  default:
     System.out.println("Enter valid choice.");	
     break;    
   }	
  }
 }
}