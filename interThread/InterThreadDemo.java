package interThread;

import sun.awt.www.content.audio.wav;

class Withdraw extends Thread
{
	Customer customer = new Customer();
	public void run()
	{
	
		System.out.println("after withdraw balance is "+customer.withdraw(3000));
		
	}
}


class Deposit extends Thread
{
	Customer customer = new Customer();
	public void run()
	{
		
		
		System.out.println("after Deposit balance is "+customer.deposit(5000));
		
	}
}


public class InterThreadDemo {

	Withdraw w = new Withdraw();
	
	
	Deposit d = new Deposit();
	
	.set
	w.start();
	
	
	d.setName("Deposit ");
	d.start();
	
	
}
