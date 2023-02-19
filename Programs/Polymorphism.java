import java.util.*;
abstract class Shape{
 abstract void number_of_sides();
}
class Rectangle extends Shape{
 void number_of_sides(){
  System.out.println("-----Rectangle-----");
  System.out.println("The number of sides of a rectangle is 4");
 }
}
class Triangle extends Shape{
 void number_of_sides(){
  System.out.println("-----Triangle-----");
  System.out.println("The number of sides of a triangle is 3");
 }
}
class Hexagon extends Shape{
 void number_of_sides(){
  System.out.println("-----Hexagon-----");
  System.out.println("The number of sides of a hexagon is 6");
 }
}

public class Polymorphism{
 public static void main(String args[]){
  Rectangle r = new Rectangle();
  r.number_of_sides();
  Triangle t = new Triangle();
  t.number_of_sides();
  Hexagon h = new Hexagon();
  h.number_of_sides();

 }
}