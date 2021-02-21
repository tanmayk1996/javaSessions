package day16multithreading;

class Aarti extends Thread
{
	public void run()
	{
		for (int i=1;i<=10;i++)
		{
			if(i==2)
				try 
			
				{
					Thread.sleep(10000);
				}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
	
}
class Archana extends Thread
{
	public void run()
	{
		for (int i=20;i<=30;i++)
		{
		 if (i==24)
		 {
			 stop();
			 
			System.out.println("archana  "+i);
		}
	}
	
}
class Abhay extends Thread
{
	
	public void run()
	{
		for (int i=30;i<=40;i++)
		{	try 
		
		{
			Thread.sleep(10000);
		}
	catch(InterruptedException e)
	{
		e.printStackTrace();
	}
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}
public class MultitaskingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(Thread.currentThread().getName()); 
		Aarti aarti = new Aarti ();
		Archana archana = new Archana();
		Abhay abhay = new Abhay();
		
		
//		aarti.run();
	//	archana.run();
	//	abhay.run();
		
		
		aarti.start();
		archana.start();
		abhay.start();
	}
}
}
}


