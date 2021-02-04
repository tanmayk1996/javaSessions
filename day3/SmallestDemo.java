package day3;

public class SmallestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int marks[]= {67,89,56,40,30,90};
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
