package day12;

import java.util.ArrayList;

public class GenericCollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ArrayList o1 = new ArrayList();
	o1.add(1);
	o1.add("sachin");
	o1.add(true);
	o1.add(23.45);
	
	ArrayList<Integer> o2 = new ArrayList<Integer>();
	o2.add(2);
	//o2.add("Sachin");
	
	ArrayList<String> o3 = new ArrayList<String>();
	o3.add("Sachin");
	o3.add("rahul");
	
	ArrayList<Employee> emp = new ArrayList<Employee>();
	emp.add(new Employee (1, "raul"));
	emp.add(new Employee (2,"kuma"));
	
	System.out.println();
	
	
	
	
	}

}




class Employee
{
	
int id;
String name;
public Employee(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}

}
