package day16multithreading;


class A extends Thread
{
	
 public void run()
 {
	 System.out.println("Hello this is my task i am in run method");
	 
 }

}
class B implements Runnable
{
	public void run()
	{
		System.out.println("this is by implements");
		System.out.println("hello this is my task in run method");
	}
}
class parent
{
	
}
class child extends Parent
{
	
}










public class CreateDemo {

	public static void main(String[] args) {

		
		A o = new A();
		//o.run();
		o.start();
		B o1 = new B();
		Thread t1 = new Thread(o1);
		t1.start();
	}

}
