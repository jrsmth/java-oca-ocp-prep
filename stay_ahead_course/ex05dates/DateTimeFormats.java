package ex05dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormats {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		System.out.println(date.getDayOfWeek()); // MONDAY 
		System.out.println(date.getMonth()); // JANUARY
		System.out.println(date.getYear());// 2020 
		System.out.println(date.getDayOfYear()); // 20

		LocalDate dt = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime tm = LocalTime.of(11, 12, 34);
		LocalDateTime dtm = LocalDateTime.of(dt, tm);
		System.out.println(dt.format(DateTimeFormatter.ISO_LOCAL_DATE)); 
		System.out.println(tm.format(DateTimeFormatter.ISO_LOCAL_TIME)); 
		System.out.println(dtm.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		
		DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(shortDateTime.format(dt)); // 1/20/20
		System.out.println(shortDateTime.format(date)); // 1/20/20
		//System.out.println(shortDateTime.format(tm)); 
	}

}
