package ex05dates;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DaylightSaving {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(2017, Month.MARCH, 26); 
		LocalTime time = LocalTime.of(0, 30);
		ZoneId zone = ZoneId.of("Europe/London");
		ZonedDateTime dateTime = ZonedDateTime.of(date, time, zone);
		System.out.println(dateTime); 
		dateTime = dateTime.plusHours(1);
		System.out.println(dateTime);

	}

}
