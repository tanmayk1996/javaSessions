package day2;

import java.util.Scanner;

public class Userinput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new scanner (System.in);
		System.out.println("Enter your Details");
	
		System.out.println("Enter your id: ");
		int id = scanner.nextInt();
		System.out.println("your id is "+ id);
		
		System.out.println("Enter your name: ");
		String name = scanner.nextLine();//it will take complete line as welcome java
		 while(scanner.hasNext())
		 {
			 System.out.println(scanner.next() +" ");
		 }
		System.out.println("Your name is "+ name);
	

	}

}


