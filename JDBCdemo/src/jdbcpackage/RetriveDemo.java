package jdbcpackage;


import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class RetriveDemo {



public static void main(String[] args) {
 
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter id to get details");
		int id =scanner.nextInt();
		
		try 
		{
			//step-1
			Class.forName("com.mysql.cj.jdbc.driver");
			System.out.println("class found");
		
			//step-2
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/train?autoReconnect=true&useSSL=false,'root','anonymus')");
		System.out.println("connection done");
	
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from employee"+id);
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" " +rs.getString(3)+" "+rs.getString(4));
			}
			//step-3
			Statement stmt =con.createStatement();
			stmt.execute("insert into employee values()6")
		
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

}
