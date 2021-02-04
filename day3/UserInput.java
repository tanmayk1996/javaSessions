package day3;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the elements you want to enter");
		int size = scan.nextInt();
				
				int marks[] =new int[size];
		
		System.out.println("Size of array"+ marks.length);
		
		for(int i=0;i<marks.length;i++)
		{
			System.out.println("Enter the value for marks ["+ i +"]=");
			marks[i]=scan.nextInt();
		}
		System.out.println();
		
		for(int i;i<marks.length;i++)
		{
			System.out.println("values are marks["+i +"]="+ marks[i]);
		}
	}

}
