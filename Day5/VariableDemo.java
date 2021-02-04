package Day5;

public class VariableDemo {

	int a=10; //global orinstance variable
	static int=20;
	
	void fun1 (int x) //x is a local variable
	{
		System.out.println("value of a"+a);
		System.out.println("value of x"+x);
		
	}
	
	void fun2 (int y) //y is a local variable
	{
		System.out.println("value of a"+a);
		//System.out.println("value of x"+x);
		System.out.println("value of y"+y);
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stu
	VariableDemo variableDemo = new VariableDemo();  //stored in heap
	
	
		System.out.println(VariableDemo.a);
		System.out.println(b);
	
	}

}
