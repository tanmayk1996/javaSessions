package day2;

import java.util.Scanner;

public class Menudriven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println("Press \n 1.Withdraw \n 2. Deposit \n 3.Account balance");

		Scanner scan = new Scanner(System.in);
		int choice =1;
		while(choice==1)
		{
			System.out.println("Enter your id");
			int id=scan.nextInt();
			
			System.out.println("Enter your name");
			String name =scan.next();
			
			System.out.println("your id is "+ id +"your name "+ name );
			
			System.out.println("do you want to continue press 1");
			choice=scan.nextInt();

		}
	}

}
