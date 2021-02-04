package Day5;


class Employee
{
	// variables or attributes
	int employeeId;
	String name;
	String dept;
	double salary;
	
	void displayEmployeedetails()
	{
		System.out.println("id is : "+ employeeId);
		System.out.println(" name is :"+ name);
		System.out.println("dept is : "+ dept);
		System.out.println("Salary is : "+ salary);
	
	}
	String checkBonusOption()
	{
		if (salary>75000.00)
			
			return "you can apply for loan";
			return "you cannot apply for loan";
	}
	
}




public class EmployeeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(" Employee Demo App");
		
		Employee ramesh = new Employee();
		ramesh.employeeId=125;
		ramesh.name="ramesh";
		ramesh.dept="HR";
		ramesh.salary=45000.00;
		
		ramesh.displayEmployeedetails();
		
		
		//String message = ramesh.checkBonusOption()
			//System.out.println(" yoru info"+ message);
				//ramesh.checkBonusOption();
		
		System.out.println(ramesh.checkBonusOption());
	}

}
