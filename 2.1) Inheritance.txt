import java.util.*;
class Employee{
 String name;
 int age;
 long phone_no;
 String address;
 int salary;
 void printSalary(){
 System.out.println("The monthly salary is "+ salary);
 }
}

class Officer extends Employee{ 
 String specialization;
}

class Manager extends Employee{
 String department;
}

public class Inheritance{
 public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  Officer e1 = new Officer();
  Manager e2 = new Manager(); 
  System.out.println("Enter the name of the officer");
  e1.name = sc.nextLine();  
  System.out.println("Enter the age of the officer");
  e1.age = sc.nextInt(); 
  System.out.println("Enter the phone no. of the officer");
  e1.phone_no = sc.nextInt(); 
  System.out.println("Enter the address of the officer");
  e1.address = sc.next(); 
  System.out.println("Enter the salary of the officer");
  e1.salary = sc.nextInt(); 
  System.out.println("Enter the specialization of the officer");
  e1.specialization = sc.next();
  e1.printSalary();

  System.out.println("----------------------------");
  System.out.println("Enter the name of the manager");
  e2.name = sc.next();  
  System.out.println("Enter the age of the manager");
  e2.age = sc.nextInt(); 
  System.out.println("Enter the phone no. of the manager");
  e2.phone_no = sc.nextInt(); 
  System.out.println("Enter the address of the manager");
  e2.address = sc.next(); 
  System.out.println("Enter the salary of the manager");
  e2.salary = sc.nextInt(); 
  System.out.println("Enter the department of the manager");
  e2.department = sc.next();
  e2.printSalary();

 }

}