package day14File;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	
	public static void main(String[] args) throws IOException {
		
		
		
		FileWriter fw = new FileWriter("abc.txt",true);// if added true then it appends
		fw.write("bye");
		fw.write(97);
		fw.write(98);
	
		fw.flush();
		fw.close();
	
	
	
	
	}
}
