import java.util.Random;
class RandomNumbers extends Thread{
 public void run() {
  for(int i=0;i<5;i++){
   Random rd = new Random();
   int randomNumber = rd.nextInt(100);
   System.out.println("Random number generated is:"+randomNumber); 
   if(randomNumber%2 == 0){
    SquareThread s = new SquareThread(randomNumber);
    s.run();
   }
   else{
    CubeThread c = new CubeThread(randomNumber);
    c.run();
   }
   try{
    Thread.sleep(1000);
   }
   catch(InterruptedException e){
    System.out.println("Exception: "+e);
   }
  }
 }
}

class SquareThread extends Thread{
 int number;
 SquareThread(int random){
  number = random;
 }
 public void run(){
  System.out.println("Square of the number is: "+(number*number));
 }
}

class CubeThread extends Thread{
 int number;
 CubeThread(int random){
  number = random;
 }
 public void run(){
  System.out.println("Cube of the number is: "+(number*number*number));
 }
}

public class Multithreading{
 public static void main(String args[]){
  RandomNumbers rn = new RandomNumbers();
  rn.start();
 }
}