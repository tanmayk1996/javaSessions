package day14File;

import java.io.File;
import java.io.IOException;
public class FileCreateDemo {

	public static void main(String[] args) throws IOException {
		
		File f = new File("abbc.txt");
		System.out.println(f.exists());// it will check
		
		f.createNewFile();
		System.out.println(f.exists());
		
		
	}

}
