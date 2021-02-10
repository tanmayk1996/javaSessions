package day11;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s = "hello";
		System.out.println("length"+s.length());
		System.out.println(s.concat("java"));
		System.out.println("name is "+s);
		System.out.println("char at"+s.charAt(2));
		System.out.println("substring "+s.substring(2));
		System.out.println("sub string at start and end"+s.substring(1,3));
		System.out.println("index of"+s.indexOf(h));
		System.out.println("replace"+s.replace('l', 'k'));
		System.out.println("equls"+ s.equals("hello"));
		System.out.println("equals ignore gase"+s.equalsIgnoreCase("Hello"));
		System.out.println(s.compareTo("hello"));
		System.out.println("d".compareTo("d")); //100-97
		System.out.println("a".compareTo("a"));	//100-97
		System.out.println("aaadddd".compareTo("aaaddd")); //100-97
	
	}

}
