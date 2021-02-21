package day15;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReverseDemo {

	public static void main(String[] args) throws IOException {
		
	
				
				
				FileReader fe = new FileReader("info.txt");
				BufferedReader bw = new BufferedReader(fe);
				
				StringBuffer sb = new StringBuffer();
				String read = bw.readLine();
				
				while (read!=null)
				{
					sb.append(read);
					
					System.out.println(read);
					read= bw.readLine();
					
				
				}
				System.out.println("content of the file :"+sb);
				
				sb.reverse();
				System.out.println("afetr reverse "+sb);
				
				BufferedWriter b = new BufferedWriter(new FileWriter("info.txt"));
				b.write(sb.toString());
				
				b.flush();
				b.close();
				
				
		
			}
			
			
		

	}
	

