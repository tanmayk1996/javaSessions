package day9;


interface Bank
{
 int  rateOfIntrest(int percent);	
  double miniumBalance(double amount);
  
}
 class Kotak implements Bank
 {

	@Override
	public double miniumBalance(double amount) {
		// TODO Auto-generated method stub
		System.out.println("the amount is :"+ amount);
		return amount;
	}

	@Override
	public int rateOfIntrest(int percent) {
		// TODO Auto-generated method stub
		System.out.println("the rate of intrest is : "+percent);
		return percent;
	}
	 
	 
 }





public class InterfaceDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank ko =new Kotak();
		ko.miniumBalance(3000);
		ko.rateOfIntrest(4);
	}

}
