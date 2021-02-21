package day15;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserInputDemoFile {

	
	public static void main(String[] args) throws IOException{
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Id :");
		 String  id =s.next();
		
		 System.out.println("Enter Name :");
		 String  name =s.next();
		 
		 System.out.println("Enter Salary :");
		 String  Salary =s.next();
		 
		
		 BufferedWriter bw = new BufferedWriter(new FileWriter("Employeeinfo1.txt",true));
		 bw.newLine();
		 bw.write(id+"		");
		 bw.write(name+"		");
		 bw.write(Salary+"		");
		 bw.flush();
		 bw.close();
		}
}
