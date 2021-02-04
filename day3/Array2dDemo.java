package day3;

import java.util.Scanner;

public class Array2dDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("enter size m & n");
		int m=scan.nextInt();
		int n=scan.nextInt();
		
		int a[] [] = new int [m] [n];
		System.out.println("enter array no");
		int count=1;
		
		 //a[1][2]=15;
		// a[3][4]=20	;	
		for(int i=0; i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=count;
				count++;
				//System.out.print(a[i][j] +" ");
			}
		}
		System.out.println("elements of array are:");
		for(int i=0; i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j] +" ");
			}
			System.out.println(" ");
		}
	}

}
