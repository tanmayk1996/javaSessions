package day10;

public class StringImmutableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a=10;
		System.out.println("value of a : "+a);
		
		
		
		String name ="Rahul";
		System.out.println(name);
		name=name+ "Dravid";
		System.out.println(name);
		
		
		name=name.concat("dravid 2");
		System.out.println(name);
	}

}
