package Day5;

class Demo
{
	int a;
	static int b;
}

public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo.b=1;
		Demo d1 = new Demo();
		d1.a=1;
		d1.b=1;
		
	
		Demo d2 = new Demo();
		d1.a=2;
		d1.b=2;
		
		
		Demo d3 = new Demo();
		d1.a=3;
		d1.b=3;
		
		System.out.println("d1 a"+d1.a +"d1 b"+d1.b);
		System.out.println("d2 a"+d2.a +"d2 b"+d2.b);
		System.out.println("d3 a"+d3.a +"d3 b"+d3.b);
	}

}
