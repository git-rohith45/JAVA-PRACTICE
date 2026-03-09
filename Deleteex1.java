  import java.sql.*;

class Deleteex1
{
public static void main(String args[])throws Exception
{
  Class.forName("oracle.jdbc.driver.OracleDriver");
  
  Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
 
  Statement stmt = con.createStatement();
  
  int n = stmt.executeUpdate("delete employee4 where name = 'hitman'");

  if(n>0)
  {
    	System.out.println("delete succesfully");
  }
  else
  {
	System.out.println("not deleted");
  }
  
   con.close();
   stmt.close();
}
}

