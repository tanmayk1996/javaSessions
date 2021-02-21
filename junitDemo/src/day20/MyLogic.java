package day20;

public class MyLogic {

	boolean checkAge(int age)
	{
		if (age>18)
		{
			return true;
		}
		else
		{
			return false;
		}
		
		String checkAge2(int age)
		{
			if (age>18)
			{
				return "eligible";
			}
			else
			{
				return "not eligible";
			}
		}
	}
}
