package day9;
interface HotDrinks
{
  char  taste(char sweetAnonymus@1996.);	
  double price(double amount);
  
}
 class Tea implements HotDrinks
 {

	@Override
	public char taste(char sweet) {
		// TODO Auto-generated method stub
		System.out.println("the taste is : "+sweet);
		return sweet;
	}

	@Override
	public double price(double amount) {
		// TODO Auto-generated method stub
		
		System.out.println("the price is : "+amount);
		return amount;
	}
	 
	 
	class Coffee implements HotDrinks
	{

		@Override
		public char taste() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public double price(double amount) {
			// TODO Auto-generated method stub
			return 0;
		}

		
		
	}
 }






		
	
public class InterfaceDemo6 {
	public static void main(String[] args) {
	

		HotDrinks t =new Tea();
		t.taste();
		t.price(20);
		System.out.println("tea : ");
		
		HotDrinks d =new Coffee();
		d.taste();
		d.price(20);
		System.out.println("Coffee");
	}
	
	
}
