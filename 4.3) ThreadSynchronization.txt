class printer{
 synchronized public void print(char c){
  for(int i=0;i<5;i++){
   for(int j=0;j<i;j++){
    System.out.print(c);
   }
   System.out.println();
  }
 }
}

class Hash extends Thread{
 printer p;
 Hash(printer p){
   this.p=p;
 }
 public void run(){
   p.print('#');
 }
}

class Star extends Thread{
 printer p;
 Star(printer p){
   this.p=p;
 }
 public void run(){
  p.print('*');
 }
}

public class ThreadSynchronization{
 public static void main(String args[]){
  printer p = new printer();
  Hash h = new Hash(p);
  Star s = new Star(p);
  h.start();
  s.start();
 }
}