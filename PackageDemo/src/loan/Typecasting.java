package loan;

public class Typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =200;
		
		double d=a;// implicit casting
		System.out.println(d);
		
		double d1 = 200.20;
		int x=(int)d1;//explicit casting
		System.out.println(x);
		
		
		byte c=(byte) a;
		System.out.println(c);
	}

}
