package day3;

public class ArrayEvenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int a[]={3,4,9,12,7,20,5}; odd count=4 odd sum=
// print even sum and odd sum along with count of the elements in array.	
		
	        int arr[] = { 3,4,9,12,7,20,5}; 
	        int even = 0, odd = 0; 
	  
	        // Loop to find even, odd sum 
	        for (int i = 0; i < arr.length; i++) { 
	            if (i % 2 == 0) 
	                even += arr[i]; 
	            else
	                odd += arr[i]; 
	        } 
	  
	        System.out.println("Even index positions sum: " + even); 
	        System.out.println("Odd index positions sum: " + odd); 
	    } 
	
	
	}


