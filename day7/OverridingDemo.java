package day7;

class Parent
{
	void property()
	{
		System.out.println("20 lakhs ");
	}

	void marry()
	{
		System.out.println("preeti");
	}
}

class Child extends Parent
{
	// child class can give his own implementation
	
	@Override
	void marry()
	{
		System.out.println(" i will marry kareena ");
	}
	void vehicle()
	{
		System.out.println("i have i20");
	}
}



public class OverridingDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Child c = new Child(); c.property(); c.marry(); c.vehicle();
		 */
		
		Parent p = new Child();
		p.property();
		p.marry();
		//p.vehicle();
	}

}
