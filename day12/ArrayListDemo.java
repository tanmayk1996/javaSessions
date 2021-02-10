package day12;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList o = new ArrayList();//10 index
		ArrayList o1= new ArrayList(30);// it creates a size of 30 index
		
		System.out.println("size of arraylist before"+o.size());
		System.out.println("elements of arraylist "+o);
	
		
		o.add(1);// autoboxing happens  integer i = 1; int i=1;
		o.add("sam");
		o.add('c');
		o.add(23.45);
		o.add(null);
		

		o.add(1);// autoboxing happens  integer i = 1; int i=1;
		o.add("sam");
		o.add('c');
		o.add(23.45);
		o.add(null);
		
		System.out.println("size of arraylist after"+o.size());
		System.out.println("elements of arraylist "+o);
	
	
		System.out.println("exixts"+ o.contains("sam1"));
		System.out.println("index"+ o.indexOf(1));
		System.out.println("index"+ o.indexOf("sam"));
		System.out.println("element at index 2 is "+o.get(2));
	
		System.out.println("==========remove======");
		o.remove(Integer.valueOf(1));
		o.remove("sam");
		
		
		System.out.println("after removing"+o);
	
		o.add(4 ,"pune");
		System.out.println("after adding at 4 th indx"+o);
	}

}
