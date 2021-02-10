package day10;

class LateException extends Exception
{
	

	public LateException(String msg) {
		super(msg);
	
		System.out.println("this is a constructor in late exception class");
	} 
	
}


class StudentLogin
{
	void loginTime (int time) throws LateException
	{
		if(time>9)
		{
			throw new LateException("You are absent");
			
		}
		else
		{
			System.out.println("you are present");
		}
	}
	
}


public class CustomExceptionDemo {

	public static void main(String[] args) throws LateException
	
	{
		// TODO Auto-generated method stub
			
			
		StudentLogin studentLogin = new StudentLogin();
		studentLogin.loginTime(10);
		
		//CustomExceptiondemo customExceptionDemo = new CustomExceptionDemo();
		//customExceptionDemo.dis
		
	}

}



