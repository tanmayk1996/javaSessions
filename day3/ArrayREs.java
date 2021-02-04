package day3;

import java.util.Scanner;

public class ArrayREs {
	
	public class UserInput {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the elements you want to enter");
			int size = scan.nextInt()
					
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
			
			//for finding total marks
			
				//for(int i=0;i<)
			int small = marks[0];
			int large = marks[0];
			for(int i=0;i<marks.length;i++)
			{
				if(small>marks[i])
				{
					small = marks[i];
				}
				
			}
			System.out.println("smallest no is"+ small);
		
			
			
			
			for(int i=0;i<marks.length;i++)
			{
				if(large<marks[i])
				{
					large = marks[i];
				}
				
			}
			System.out.println("largest no is"+ large);
		}
		
		}
		

	}

}
