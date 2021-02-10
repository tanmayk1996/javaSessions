package day7;

class Employee
{

	int id;
	String name;
	Address address;
	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}


	void displayEmployeeInfo()
	{
		System.out.println("id"+ id);
		System.out.println("name"+ name);
		System.out.println("doorno"+ address.doorNo);
		System.out.println("StreetName "+ address.StreetName);
		System.out.println("city"+ address.city);
	}


	class Address
	{
		int doorNo;
		String StreetName;
		String city;
		public Address(int doorNo, String streetName, String city) {
			super();
			this.doorNo = doorNo;
			StreetName = streetName;
			this.city = city;
		}



	}

	public class HasA {

		public static void main(String[] args) {
			
		

			Address address = new Address(234,"Btm","kop");

			Employee emp = new Employee(1,"rah",address);

			emp.displayEmployeeInfo();

		}

	}
}