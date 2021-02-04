package Day5;

public class StaticPropertyCalling {

	
	static int a= 20;
	
	static void display() 
	{
		System.out.println("this is display funciton");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.out.println(StaticPropertyCalling.a);
			
			StaticPropertyCalling.display();
			
			display();
	}

}
