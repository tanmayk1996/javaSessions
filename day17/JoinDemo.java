package day17;


class Engagement extends Thread
{
	public void run()
	{
		for (int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}

class CardDistribution extends Thread
{
	public void run()
	{
		for (int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}
class Marriage extends Thread
{
	public void run()
	{
		for (int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}
public class JoinDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Engagement engagement = new Engagement();
		CardDistribution carddistribution = new CardDistribution();
		Marriage marriage= new Marriage();
		
		
		
		engagement.setName("engagement");
		carddistribution.setName("card distribution");
		marriage.setName("marriage");
		
		engagement.start();
		//engagement.join();
		
		carddistribution.start();
		//carddistribution.join();
		
		marriage.start();
		//marriage.join();
	}

}
