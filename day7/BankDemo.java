package day7;


class Bank
{
	void rateofIntrest()
	{
		System.out.println("2%");
	}
	
	void minBalance()
	{
		System.out.println("1000 Rs");
	}
}
class Axis extends Bank
{
	void rateofIntrest()
	{
		super.rateofIntrest();
		System.out.println("4%");
	}
	
}

class Icic extends Bank
{
	void rateofIntrest()
	{
		System.out.println("7%");
	}
}


public class BankDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank ax = new Axis();
		Bank ic= new Icic();
	
		ax.rateofIntrest();
		ax.minBalance();
		ic.rateofIntrest();
		ic.minBalance();
		
	}

}
