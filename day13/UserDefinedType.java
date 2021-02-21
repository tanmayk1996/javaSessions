package day13;

import java.util.ArrayList;
import java.util.Collections;

class Employee  implements Comparable<Employee>

{
	int id ;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public int compareTo(Employee o) {
	//	if(id==o.id)
		//return 0;
	//	else if(id>o.id)
	//		return 1;
	//	return -1;
		
		//for sorting by name 
		return name.compareTo(o.name);
		
		
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	

}


public class UserDefinedType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Employee> emplist = new ArrayList<Employee>();
		emplist.add(new Employee (1,"sam"));
		emplist.add(new Employee (2,"rahul"));
		emplist.add(new Employee (3,"pant"));
		
		
		System.out.println("elements are :"+emplist);
		for(Employee e : emplist) 
		{
			
			System.out.println(e.id + "  "+ e.name);
		}
		
		Collections.sort(emplist);
		System.out.println("=============AfterSorting===========");
	
	
	for (Employee e : emplist)
	{
		System.out.println(e.id + "  "+ e.name);
	
	
	}
	}
}
