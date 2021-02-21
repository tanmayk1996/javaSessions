package day13;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList JavaBatch = new ArrayList();
		
		
		JavaBatch.add("arati");
		JavaBatch.add("aabhay");
		JavaBatch.add("deepa");
		JavaBatch.add("darshan");
		System.out.println("the javaBatch is:"+JavaBatch);
		
		ArrayList SoftskillBatch= new ArrayList();
		SoftskillBatch.add("anjali");
		SoftskillBatch.add("abhishek");
		SoftskillBatch.add("nikhil");
		SoftskillBatch.add("deepa");
		SoftskillBatch.add("arati");
		SoftskillBatch.add("pavan");
	
		System.out.println("the softskill batch is "+SoftskillBatch);
	
		SoftskillBatch.removeAll(JavaBatch);
		System.out.println("after removing"+SoftskillBatch);
		
		
		SoftskillBatch.addAll(JavaBatch);
		System.out.println(" combined Batch is "+SoftskillBatch);
	
		Collections.sort(SoftskillBatch);
		System.out.println("aftr sorting "+SoftskillBatch);
	}

}
