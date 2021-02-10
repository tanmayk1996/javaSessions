package Day8;

	//cRETE 2 METHODS 1 NORMAL
	//2 LOGIN - ABSTRACT
	 //CALL IN DIIFF CLASS MORNIG NIHGHT 

abstract class Timings
{
	abstract void hours(String a,String b);
	void display ()
	{
		System.out.println(" ");
	}

	
	abstract class  loginTime
	{
		
		abstract void login
	{
		System.out.println(" ");
	}
	
	}

}



class MorningShift extends Timings
{

	@Override
	void hours(String a, String b) {
		// TODO Auto-generated method stub
		
	}

	

}

class NightShift extends Timings
{

	@Override
	void hours(String a, String b) {
		// TODO Auto-generated method stub
		
	}

	
	

}
class MorningShift extends loginTime
{

	

	

}

class NightShift extends loginTime
{

	

	
	

}





public class LoginDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		

		MorningShift m = new MorningShift();
				m.display();
				
	
		Nightshift n = new NightShift();
		     
			
	}

}
