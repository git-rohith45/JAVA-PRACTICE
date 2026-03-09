import java.sql.*;
class Updateemployee4ex2
{
public static void main(String args[]) throws Exception
{
   Driver d = new oracle.jdbc.driver.OracleDriver();

   DriverManager.registerDriver(d);

   Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");

   Statement stmt = con.createStatement();

   int n = stmt.executeUpdate("update employee4 set salary=8000 where name = 'hitman'");
   
   if(n>0)
   {
     System.out.println("record is successfully inserted");
   }
    else
   {
     System.out.println("record is inserted");
   }

    stmt.close();
    con.close();
}
}
