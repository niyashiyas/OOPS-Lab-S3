import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class TestJDBCSQL{
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
      System.out.pritnln("ID= "+id+"Name= "+name);
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