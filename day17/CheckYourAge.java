package day17;

import java.time.LocalDate;
import java.time.Period;



public class CheckYourAge {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		LocalDate birthdate= LocalDate.of(1996, 7,25);
		
		Period period =Period.between(birthdate, today);
		System.out.println(period.getYears()+" years "+period.getMonths()+" months "+ period.getDays()+" days ");
	}
}
