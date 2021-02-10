package day11;

public class CountVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name ="appleballcar";
		String temp=" ";
		int count=0;
		
		for (int i=0;i<name.length();i++)
		{
			char c=name.charAt(i);
			
			if(c=='a'|| c=='e'|| c=='i'||c=='o'||c=='u')
			{
				count++;
			//	System.out.println(c);
				temp+=c; // temp=temp+c
			}
			
		}
		System.out.println("the count is : "+count);
		System.out.println("vowel characters are :-" +temp);
	}
		
}
