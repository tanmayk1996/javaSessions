package encpsulation;


class Employee
{
	 private int id;
	private  String name;
	
	public void setId(int id)
	{
		this.id=id;
		
	}
	public int getId()
	{
		return id;
	}
	
	public void setName(String name)
	{
		this.name=name;
		
	}
	public String getName()
	{
		return name;
	}
}
public class EncpsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Employee e = new Employee();
			e.setId=(2);
			//e.name="sam";
			System.out.println(e.getid());
	}

}
