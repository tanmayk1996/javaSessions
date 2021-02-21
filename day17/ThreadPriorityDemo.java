package day17;



class Hello extends Thread
{
	public void run()
	{
		for (int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
	
}
class Welcome extends Thread
{
	public void run()
	{
		for (int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
	
}

public class ThreadPriorityDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Hello hello = new Hello();
		Welcome welcome = new Welcome();
		
		hello.start();
		welcome.start();
	}

}
