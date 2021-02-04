package day3;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int marks[]=new int[5];
		
		System.out.println("Size of array"+marks.length);
		
		marks[1]=67;
		marks[4]=80;
		
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		System.out.println(marks[4]);
		
		//Iterating through loop
		
		for(int i=0;i<marks.length;i++) 
		{
			System.out.println(marks[i]);
		}
	}
}
