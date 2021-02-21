package day15;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferredWriterDemo {

	public static void main(String[] args) throws IOException {
	
		//File f = new File("h1.txt");
		FileWriter fw = new FileWriter("h1.txt");
		
		BufferedWriter bw = new BufferedWriter(fw);
		//bw.write("hello");
		bw.newLine();
		//bw.write("java");
		bw.newLine();
		//bw.write("Pune");
		
		bw.flush();
		bw.close();
	}
}
