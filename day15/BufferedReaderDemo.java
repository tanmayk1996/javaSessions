package day15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		
		
		FileReader fe = new FileReader("info.txt");
		BufferedReader bw = new BufferedReader(fe);
		
		String read = bw.readLine();
		
		while (read!=null)
		{
			
			System.out.println(read);
			read= bw.readLine();
			
		
		}
		
		
	//	System.out.println(bw.readLine());
	//	System.out.println(bw.readLine());
	}
	
	
}
