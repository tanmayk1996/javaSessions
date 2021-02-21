package day13;

import java.awt.List;
import java.util.LinkedList;
import java.util.ArrayList;



public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList l = new LinkedList();
		l.add(2);
		l.add(5);
		l.addFirst(10);
		l.addLast(4);
		l.add(25);
		
		System.out.println("Linked list"+ l);
		
		
		l.removeFirst();
		System.out.println("linked list "+l);
	
		l.removeLast();
		System.out.println("linked list "+l);
			
	
	}

}
