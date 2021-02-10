package day11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//String str = "abavajava";
		
		 Pattern p1 = Pattern.compile("ab");
		 Pattern p2 = Pattern.compile("ja");
		 
		 p1.matcher("abavajava");
		 Matcher mat = p1.matcher("abavajava");
		 while(mat.find())
		 {
			 System.out.println(mat.start()+" "+ mat.end()+" "+mat.group());
		 }
		 
		 
		 System.out.println("=============");
		 Matcher m = Pattern.compile("ja").matcher("javajava");
		 while(m.find())
		 {
			 
			 System.out.println(m.start() +" "+ m.end()+" "+m.group());
		 }
		 
	}

}
