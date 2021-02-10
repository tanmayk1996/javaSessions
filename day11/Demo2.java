package day11;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "hello Java";
		
		
		for (int i=0;i<name.length();i++)
		{
			
			System.out.println(name.charAt(i));
		}
	
		
		//for reverse
		for (int i=name.length()-1;i>name.length();i--)
		{
			System.out.println(name.charAt(i));
		}
	}

}
