package day12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList o1=new ArrayList();
		o1.add(4);
		o1.add(5);
		o1.add(6);
		o1.add(7);
		
		System.out.println("elements of o1"+o1);
		
		Iterator it= o1.iterator();//4,5,6,7
		while(it.hasNext())
		{
			System.out.println(it.next());
			
		}
		
		System.out.println("===============List Iterator========");
		ListIterator li=o1.listIterator();
		
		
		System.out.println("forward Direction");
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		
		System.out.println("Backward");
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
		
		
		
		
		
		
	}

}
