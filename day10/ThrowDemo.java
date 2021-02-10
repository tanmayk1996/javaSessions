package day10;




public class ThrowDemo {

	void loginTime(int time)
	{
		System.out.println("you have logged at "+ time);
		if(time>9)
		{
			throw new ArithmeticException("You ARE absent");
		}
		else 
		{
			System.out.println("you are prestnt");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//throw new ArithmeticException("it is throwing");
		ThrowDemo t = new ThrowDemo();
		t.loginTime(11);
		
	}

}
