package exceptionExersize;



class AgeException extends Exception
{
	

	public AgeException(String age) {
		super(age);
	
		System.out.println("the age is : ");
	} 
	
}


class CheckEligiblity
{
	void Eligiblity (int age) throws AgeException
	{
		if(age>18)
		{
			throw new AgeException("You can vote");
			
		}
		else
		{
			System.out.println("you are a minor");
		}
	}
	
}



			

public class AgeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		CheckEligiblity c = new CheckEligiblity();
		c .Eligiblity(18);	

	}

}
