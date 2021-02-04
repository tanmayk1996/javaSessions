package day3;

import java.util.Arrays;

public class ArrayDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int a[]= {12,14,7,8,9,15,13};
	
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i] +" ");
		
	}
	System.out.println();
	Arrays.sort(a);
	
	System.out.println("After sorting");
	for(int i=0 ; i<a.length;i++)
	{
		System.out.print(a[i] +" ");
	}
	
	
	
	int found =Arrays.binarySearch(a, 0);
	if(found>0)
		System.out.println("elements found at"+ (found+1));
	else
		System.out.println("elements not found");
	}

}
