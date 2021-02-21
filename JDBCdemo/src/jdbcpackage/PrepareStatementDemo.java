package jdbcpackage;

java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PrepareStatementDemo {

	
	
	

	public static void main(String[] args) {
	 
			Scanner scanner = new Scanner(System.in);
			System.out.println("enter id to get details");
			int id =scanner.nextInt();
			
			System.out.println("enter name to get details");
			String name =scanner.next();
			
			System.out.println("enter dept to get details");
			String dept =scanner.next();
			
			System.out.println("enter age to get details");
			int age =scanner.nextInt();
			
			
			
			
			try 
			{
				//step-1
				Class.forName("com.mysql.cj.jdbc.driver");
				System.out.println("class found");
			
				//step-2
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/train?autoReconnect=true&useSSL=false","root" "anonymus"))
			System.out.println("connection done");
		
			
		//	PreparedStatement ps = con.prepareStatement("insert into employee values (?,?,?,?)");
		//	ps.setInt(1, id);
		//	ps.setString(2, name);
		//	ps.setString(3, dept);
		//	ps.setInt(4, age);
			
		//	ps.execute();
			
				PreparedStatement ps = con.prepareStatement("select * from employee where id = ?");
			
			System.out.println("inserted.....");
			
			}
			catch (Exception e)
			{
				System.out.println(e);
			}
		}
}
