package Day8;
interface Loan
{
	void loanslab();
}

interface Employee extends Loan
{
	int LoginHours =8;
	void designation();
}
class Manager implements Employee
{

	@Override
	public void designation() {
		// TODO Auto-generated method stub
		System.out.println("i manage team for tow clients");
		System.out.println("i work for"+LoginHours+"hour");
	}

	@Override
	public void loanslab() {
		// TODO Auto-generated method stub
		
	}
	
}

class Devloper implements Employee
{

	@Override
	public void designation() {
		// TODO Auto-generated method stub
		

		System.out.println("i manage team for tow clients");
		System.out.println("i work for"+LoginHours+"hour");
	}
	}


public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Manager m = new Manager();
			m.designation();
	}

}
