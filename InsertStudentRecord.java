package com.wwps.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertStudentRecord 
{
	public static void main(String[] args) 
	{
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "fp6", "welcome1");
			pstmt = con.prepareStatement("insert into student values(?, ?, ?, ?)");
			pstmt.setInt(1, 1);
			pstmt.setString(2, "ravi");
			pstmt.setString(3, "m");
			pstmt.setDouble(4, 1000.0);
			int n = pstmt.executeUpdate();
			
			if(n > 0) {
				System.out.println("record is inserted");
			}else {
				System.out.println("record is not inserted");
			}
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(pstmt != null) {
					pstmt.close();
				}
				
				if(con != null) {
					con.close();
				}
			}
			catch(SQLException e) {}
		}
	}
}