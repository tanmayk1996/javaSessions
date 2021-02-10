package day9;

public class ExceptionDemo1 {

	public static void main(String[] args) {
	
		
		int a = 10;
		int b =0;
		int arr[]= new int [5];
		
		System.out.println("banglore to chennai started");
		System.out.println("50");
		System.out.println("100");
		try
		{
			System.out.println(a/b);
			arr[7]=10;
			System.out.println("two");
		}
		catch(ArrayIndexOutOfBoundsException obj)
		{
			
				System.out.println("Array index outof bound");
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Do not give 0 ");
		}
		System.out.println("150");
		System.out.println("200 ");
		System.out.println("thankyou completed ");
}
}
