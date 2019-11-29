package ex05dates;

import java.time.*;

public class DateManipulation {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		System.out.println(date.plusDays(2));
		System.out.println(date.plusWeeks(8));
		System.out.println(date.plusMonths(6));
		System.out.println(date.plusYears(1));

		System.out.println(date.minusDays(2));
		System.out.println(date.minusWeeks(8));
		System.out.println(date.minusMonths(6));
		System.out.println(date.minusYears(1));
		
		date = date.plusYears(2).plusMonths(6).plusDays(2);				
		System.out.println(date); 
	}

}
