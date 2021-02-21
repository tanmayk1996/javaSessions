package jdbcpackage;
 import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCconnectionDemo {

	public static void main(String[] args) {

		
		try 
		{
			//step-1
			Class.forName("com.mysql.cj.jdbc.driver");
			System.out.println("class found");
		
			//step-2
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/train1?autoReconnect=true&useSSL=false,'root','anonymus')");
	//		System.out.println("connection done");
	//step-3
		//	Statement 
		
		}
		catch (Exception e)
		{
			System.out.println("class not found");
		}
	}

}
