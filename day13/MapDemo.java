package day13;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class MapDemo {

	public static void main(String[] args) {

		
		HashMap h = new HashMap();// here we dont have a method  so put is used.
		h.put("Sachin", "Sachin is a opening batsaman");
		h.put("rahul", "middle order");
		h.put("pant", "pant is a middle batsaman");
		h.put("rahul", "head coach");
		
	
		System.out.println(h);
		System.out.println(h.get("Sachin"));
		System.out.println(h.containsKey("pant"));
		System.out.println(h);
	
		System.out.println("getting keys "+h.keySet());
		System.out.println("getting values"+h.values());
		
		System.out.println("both key and values"+h.entrySet());
		
		
		LinkedHashMap lh = new LinkedHashMap();
		lh.put("Sachin", "Sachin is a opening batsaman");
		lh.put("rahul", "middle order");
		lh.put("pant", "pant is a middle batsaman");
		lh.put("rahul", "head coach");
		

		System.out.println(lh);
		System.out.println(lh.get("Sachin"));
		System.out.println(lh.containsKey("pant"));
		System.out.println(lh);	
		System.out.println("getting keys "+lh.keySet());
		System.out.println("getting values"+lh.values());
		
		System.out.println("both key and values"+lh.entrySet());
		

	
//		LinkedHashMap tm = new LinkedHashMap();
	//	tm.put("Sachin", "Sachin is a opening batsaman");
	//	tm.put("rahul", "middle order");
	//	tm.put("pant", "pant is a middle batsaman");
	//	tm.put("rahul", "head coach");
		

//		System.out.println(tm);
	//	System.out.println(tm.get("Sachin"));
		//System.out.println(tm.containsKey("pant"));
		//System.out.println(tm);	


	
	
	
	}

}
