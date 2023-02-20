import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class TestJDBC{
 public static void main(String args[]){
  Statement stmt = null;
  Connection c = null;
  try{
   Class.forName("com.mysql.jdbc.Driver");
   c=DriverManager.getConnection("jdbc:mysql://localhost:3306/RISHI","mec","mec");
   System.out.println("Opened database successfully");
   stmt=c.createStatement();
   ResultSet rs = stmt.excecuteQuery("SELECT * FROM COMPANY;");
   
    while(rs.next()){
      int id = rs.getInt("id");
      String name = rs.getString("name");
      int age = rs.getInt("age");
      String address = rs.getString("address");
      float salary = rs.getInt("salary");
      System.out.pritnln("ID= "+id+", Name= "+name+", Age= "+age+" ,Address= "+address+"Salary= "+salary);
      System.out.pritnln(); 
    }
    rs.close();
    stmt.close();
    c.close(); 
  }
  catch(Exception e){
    System.err.println(e.getClass().getName()+": "+e.getMessage());
    System.exit(0);
  }
  System.out.println("Operation done successfully");
 }
}