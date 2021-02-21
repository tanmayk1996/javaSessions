package day13;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		HashSet h = new HashSet(); //own order (hashtable)
		h.add(3);
		h.add(6);
		h.add(20);
		h.add("java");
		h.add("hello");
		h.add("java");// no duplicate
		
		
		System.out.println("hashset "+h);
	
		LinkedHashSet lh = new LinkedHashSet(); // hashtable + linkedlist
		lh.add(3);
		lh.add(6);
		lh.add(20);
		lh.add("java");
		lh.add("hello");
		lh.add("java");
		
		System.out.println("LinkedHashSet"+ lh);
		
		
		
		TreeSet t = new TreeSet(); // inteernally sorts the element
		t.add(10);	// Integer --> autoboxing --> comparable
		t.add(16);
		t.add(5);
		t.add(14);
		
		System.out.println("tree set "+t);
		
		
		TreeSet t1 = new TreeSet();
		t1.add(new String ("hello"));
		t1.add("hi");
		t1.add("Apple");
		
		System.out.println(t1);
		
		
		
		TreeSet<StringBuffer> t2 = new TreeSet<StringBuffer>();
		t2.add(new StringBuffer ("hello"));
		//t2.add("hi");
		t2.add(new StringBuffer("Apple"));
		
		System.out.println(t2);
		
	}

}
