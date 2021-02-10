package day11;

public class RemoveDuplicatechar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String r = "AppleBallCar";
		String r1 = " ";
		for(int i=0;i<r.length();i++)
		{
			char c=r.charAt(i);
			
			
			if(c!=' ')
			{ 
				r1=r1+c;
				r=r.replace(c, ' ');
			}	
			
		}
		System.out.println("r  =  "+r);
		System.out.println("r1 = "+r1);

	
	}

}
