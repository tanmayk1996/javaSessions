package day14;

import java.util.ArrayList;

import sun.jvm.hotspot.gc.parallel.PSYoungGen;



class Product 
{
	@Override
	public String toString() {
		return "product [id=" + id + ", name=" + name + ", price=" + price + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	int id ;
	String name;
	int price;
	public product(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}


class PriceComparator implements Comparator<Product>
{
	
	
}
public class ComparatorDemo {

	public static void main(String[] args) {
		
		ArrayList<Product>Pl = new ArrayList<Product>();
		Pl.add(new Product (100 , "laptop" , 60000));
		Pl.add(new Product (105 , "mobile" , 45000));
		Pl.add(new Product (145 , "pc" ,20000));
		
		for (Product p : Pl)
		{
			System.out.println(p.id+ " "+ p.name+" "+p.price);
		}
	}
	
}
