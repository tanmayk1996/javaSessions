package day15;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;




public class FileWriterDemo {

	public static void main(String[] args) throws IOException {

		File f = new File("hello.txt");
		
		
		FileWriter f2 = new FileWriter("hello2.txt", true);
		f2.write("hello");
		f2.write("\n");
		f2.write("java");
	
		f2.flush();
		f2.close();
	}

}
