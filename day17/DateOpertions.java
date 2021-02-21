package day17;

import java.time.LocalDate;

public class DateOpertions {

	
	public static void main(String[] args) {
		
		LocalDate date= LocalDate.now();
		System.out.println("today date "+date);
		System.out.println("previous date "+date.minusDays(1));
		System.out.println("Next date "+ date.plusDays(2));
		
		
		
	}
}
