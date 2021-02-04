package Day6;
 class A
 {
	 int a=20;
 }
 class B extends A
 {
	 int b=30;
 }
 class C extends B
 {
	 public void add()
	 {
		 int result =a+b;
		 System.out.println("result is :"+result);
		 
	 }
 }
public class Inheritancedemo2 {

	public static void main(String[] args) {
		C obj = new C();
		obj.add();
	}
}
