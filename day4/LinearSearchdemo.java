package day4;

public class LinearSearchdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {2,8,6,5,19,13,7};
		
		int findnum=4;
		int position=0;
		int flag=0;
		
		for (int i=0;i<a.length;i++)
		{
			if(a[i]==findnum)
			{
				position=i+1; //it gives the index no
				flag=1;
				break;
				//System.out.println("");
			}
			else
			{
				flag= 0;
				//System.out.println("");
			}
			
		}
		if(flag==1)
		{
			System.out.println("the element is found at : " +position);
		}
		else
		{
			System.out.println("the element is not found " +position);
		}
	}

}
