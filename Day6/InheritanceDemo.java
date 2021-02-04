package Day6;


class Parent // only parent property
{
 //	void parentInfo()
 //	{
 //		System.out.println("I am a parent mo house address is btm");
 //		System.out.println("my phno is99998888");
 //	}
	int a=10;
}

class Child extends Parent //parent and child property 
{
	int a=20;
	void addition()
	 	{
			int result1=a+a;
			System.out.println("result1"+ result1);
	 		//System.out.println("my phno is99998888");
			int result2 =super.a+a;
			System.out.println("result1"+ result2);
	 	
	 	}
		
	//System.out.println("");
}
public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child c = new Child();
		System.out.println();
	}

}
