public class GarbageCollector{
 public static void main(String args[]){
  Runtime r = Runtime.getRuntime();
  long mem1,mem2;
  mem1= r.freeMemory();
  System.out.println("The total memory is:"+r.totalMemory());  
  System.out.println("The initial free memory is:"+mem1);
  int a[]= new int[10000];
  mem2= r.freeMemory();
  System.out.println("The free memory after allocation is:"+mem2); 
  System.out.println("The memory used is "+(mem1-mem2));
  a=null;
  r.gc();
  mem1= r.freeMemory();
  System.out.println("The free memory after garbage collection is: "+mem1);
 }
}