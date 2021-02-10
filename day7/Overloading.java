package day7;

public class Overloading {

	void displayInfo ()
	{
		System.out.println("zero parameter");
	}
	
	
	
	void displayInfo (int id)
	{
		System.out.println("your id : "+id);
		
	}
	
	
	
	void displayInfo (String name)
	{
		System.out.println("your name : "+name);
		
	}
	
	
	void displayInfo (int id,String name)
	{
		System.out.println("your id : "+id);
		System.out.println("your name : "+ name);
		
	}
	
	
	void displayInfo (String name,int id)
	{
		System.out.println("your name : "+name);
		System.out.println("your id : "+id);
		
	}
	
	
	public static void main(String[] args) {
		Overloading obj = new Overloading();
		obj.displayInfo("69");
	}
	
	
}
