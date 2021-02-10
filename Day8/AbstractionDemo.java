package Day8;

abstract class Operation
{
	//abstract void numbers(int a,int b, int c);
	
	void display ()
	{
		System.out.println("this is normal method");
	}

}

class Sachin extends Operation
{

	@Override
	void numbers(int a, int b, int c) {
		// TODO Auto-generated method stub
		
		System.out.println(a+b+c);
	}
	

}

class Rahul extends Operation
{

	@Override
	void numbers(int a, int b, int c) {
		// TODO Auto-generated method stub
		
		
		System.out.println(a-b-c);
	}
	

}


public class AbstractionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sachin s = new Sachin();
				s.numbers(3, 4, 5);
				s.display();
	
		Rahul r = new Rahul();
		     r.numbers(1, 3, 7); 
			r.display();
	}

}
