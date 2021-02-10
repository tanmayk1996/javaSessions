package day12;

import java.util.ArrayList;

public class ColletionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList o1=new ArrayList();
		o1.add(1);
		o1.add(2);
		o1.add(3);
		o1.add(4);
		
		System.out.println("elements of o1"+o1);
		

		ArrayList o2=new ArrayList();
		o2.add(4);
		o2.add(5);
		o2.add(6);
		
		System.out.println("elements of o2"+o2);
		
	//	o2.addAll(o1);//adds 01 collection into o2
	//System.out.println("elements of o2 after adding o1"+o2);
	
	//o2.removeAll(o1);//
	//System.out.println("elements of o2"+o2);
	
		
		o2.retainAll(o1);//common elements will be retained
		System.out.println("common elements will be retained"+o2);
	
	
	}

}
