package day13;

import java.util.ArrayList;
import java.util.Collections;

public class Collectiondemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Integer> o1 = new ArrayList<Integer>();
		o1.add(1);
		o1.add(12);
		o1.add(30);
		o1.add(40);
		o1.add(50);
		
		
		System.out.println("elements are "+o1);
		
		
		Collections.sort(o1);
		System.out.println("aftr sorting "+o1);
		
	//	Collections.reverse(o1);;
	//	System.out.println("after reverse "+o1);
		
		System.out.println("minimum values " +Collections.min(o1));
	

		System.out.println("maximum values " +Collections.max(o1));
	
		int index = Collections.binarySearch(o1, 40);
		System.out.println("elements found at "+index);
		
		
		
	
		
	}

}
