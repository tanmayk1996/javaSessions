package interThread;


public class Customer {

	
	int balance = 0;
	int flag=0;
	
	public synchronized int withdraw(int amount)
	{
		System.out.println(Thread.currentThread().getName()+"Is going to Withdraw");
		if (flag==0)
		{
			try
			{
				System.out.println("waiting");
				wait();
				
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		balance -=amount;
		return balance;
	}
	public synchronized int deposit(int amount)
	{
		
		System.out.println(Thread.currentThread().getName()+"Is going to Deposit ");
		balance +=amount;
		flag=1;
		
		
		notifyAll();
		
		
		
		
		return balance;
	}
}
