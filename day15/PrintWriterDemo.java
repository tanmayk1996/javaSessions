package day15;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws IOException  {
		
		PrintWriter pw = new PrintWriter("myfile.txt");
		pw.write(1000);//convert to character
		pw.print(1000);//same type of  data.
		
		
		
		
		pw.flush();
		pw.close();
		System.out.println("Success");
				
		
	}
	
}
