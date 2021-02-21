package day17;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateDemo {

	public static void main(String[] args) {
		
		System.out.println(LocalDate.now());
	
	LocalDate today = LocalDate.now();
	System.out.println(" today date is "+ today);
	System.out.println(" month "+ today.getMonth());
	System.out.println(" year is "+ today.getYear());
	System.out.println(" day is "+ today.getDayOfMonth());
	System.out.println(" day of the week "+ today.getDayOfWeek());
	System.out.println(" day of the week "+ today.getDayOfYear());
	
	System.out.println(LocalDateTime.now()); 
	LocalDateTime datetime = LocalDateTime.now();
	
	System.out.println(" hour "+ datetime.getHour());
	
	
	}
}
