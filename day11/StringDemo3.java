package day11;

public class StringDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="hello";//literal
		String s1 = new String ("hello");
		
		
		StringBuffer sb = new StringBuffer("hello");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}

}
