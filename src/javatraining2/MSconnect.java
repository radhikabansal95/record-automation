package javatraining2;
import java.sql.*;

public class MSconnect
{
	
	MSconnect()
	{
		
	}
	public static Connection connecrDb()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
		}
		catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}
		try{
			String URL="jdbc:oracle:thin:@localhost:1521:orcl";
			return DriverManager.getConnection(URL,"hr","hr");
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		return null;
	}
	public static void main(String args[])
	{
		Connection c=connecrDb();
		if(c==null)
		System.out.println("null");
	else
		System.out.println("not null");
	}
}