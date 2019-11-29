package ex05dates;

import java.util.Date;
import java.time.*;

public class DateTimes {

	public static void main(String[] args) {
		
		System.out.println(new Date());
		System.out.println(new Date(1000000000000L));
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now()); 
		System.out.println(LocalDateTime.now()); 
		System.out.println(ZonedDateTime.now());

		LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20); 
		LocalDate date2 = LocalDate.of(2015, 1, 20);
		LocalTime time1 = LocalTime.of(6, 15);
		LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);
		
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(time1);
		System.out.println(dateTime2);
		
		ZoneId zone = ZoneId.of("Europe/London");
		System.out.println(ZonedDateTime.of(2017, 9, 27, 16, 20, 0, 0, zone));
		System.out.println(ZonedDateTime.of(date1, time1, zone)); 
		System.out.println(ZonedDateTime.of(dateTime2, zone)); 
		System.out.println(ZoneId.systemDefault());
		
	}

}
