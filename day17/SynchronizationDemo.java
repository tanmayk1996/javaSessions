package day17;

class Drink
{
  public void drinkTime(int time)
	{
		for(int i=0;i<time;i++)
		{
			System.out.println(Thread.currentThread().getName()+" is drinking eating"+i);
		}
		
	
 
 	synchronized(this)
 	{
 	
 		for(int i=0;i<time;i++)
		{
			System.out.println(Thread.currentThread().getName()+" is drinking water"+i);
		}
	
 	}
}
}
class WaterBottle extends Thread
{
	Drink d= new Drink();
	
	public void run()
	{
//		for (int i=0;i<=10;i++)
	//	{
		//	System.out.println(Thread.currentThread().getName()+"Drinking Water");
		//}
		d.drinkTime(10);
		
	}
}



public class SynchronizationDemo {

	
	public static void main(String[] args) {
		
		WaterBottle w = new WaterBottle();
		
		Thread akshay = new Thread(w);
		Thread tanmay  = new Thread(w);
		
		akshay.setName("Akshay");
		tanmay.setName("tanmay");
		
		
		
		akshay.start();
		tanmay.start();
		
	}
}
