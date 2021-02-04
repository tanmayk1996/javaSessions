package Day5;


class Student
	{
		int id;
		String name;
		static String companyname="abc company";
		
	}
public class StaticMemory {
	public static void main(String[] args) {
		Student ravi = new Student();
		ravi.id=1;
		ravi.name="ravi kumar";
		
		Student ramesh = new Student();
		ramesh.id=2;
		ramesh.name="ramesh kumar";
		
		Student kumar = new Student();
		kumar.id=3;
		kumar.name=" kumar";
		kumar.companyname="fujitsu";
		
		System.out.println(ravi.id+""+ravi.name+""+ Student.companyname);
		System.out.println(ramesh.id+""+ramesh.name+""+ Student.companyname);
		System.out.println(kumar.id+""+kumar.name+""+ Student.companyname);
	}

}
