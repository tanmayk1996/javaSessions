package day9;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,result;
		Scanner s = new Scanner(System.in);
		System.out.println("enter two inputs");
		
		
		System.out.println("enter a value");
		a=s.nextInt();
		
		System.out.println("enter b value");
		b=s.nextInt();
		
		try
		{
			result=a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println("do not enter zero");
		}
		System.out.println("Addition is : "+result);
	}

}
