package ex04functional;

import java.util.Optional;
import java.util.stream.Stream;
import java.time.*;

public class Literals{
    public static void main(String[] args){
        int i = 100;
        System.out.println("i = " + i);
        Long by = new Long(100);
        System.out.println("by = " + by);
        short sh = 100;
        System.out.println("s = " + sh);
        Stream<String> s = Stream.of("uno", "dos", "tres", "cuatro"); 
        Optional<String> min = s.min((s1, s2) -> s1.length() - s2.length()); min.ifPresent(System.out::println);
        String string = "hXy";
        System.out.println(string.contains("X"));
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now()); 
        System.out.println(LocalDateTime.now()); 
        System.out.println(ZonedDateTime.now());
        ZoneId zone = ZoneId.systemDefault();
        System.out.println(zone);
        LocalDate date = LocalDate.of(2017, Month.MARCH, 26); 
        LocalTime time = LocalTime.of(0, 30);
        // ZoneId zone = ZoneId.of("Europe/London");
        ZonedDateTime dateTime = ZonedDateTime.of(date, time, zone);
        System.out.println(dateTime); // 2016–03–13T01:30–05:00[US/Eastern] 
        dateTime = dateTime.plusHours(1);
        System.out.println(dateTime); // 2016–03–13T03:30–04:00[US/Eastern]

        
    }
}