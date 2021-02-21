package day15;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BufferWriterUserInputDemo {

	public static void main(String[] args) throws IOException{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name");
		String name=sc.next();
		
		System.out.println("enter the age");
		String age=sc.next();
		
		FileWriter fw = new FileWriter("info.txt");
		BufferedWriter bw =new BufferedWriter(fw);
		
		bw.write("name : "+name);
		bw.newLine();
		bw.write("age : "+age);
		bw.newLine();
		
		bw.flush();
		bw.close();
	
	}
}
