package ex05dates;

import java.time.Duration;

public class DurationTest {

	public static void main(String[] args) {
		
		Duration daily = Duration.ofDays(1); // PT24H
		Duration hourly = Duration.ofHours(1); //PT1H
		Duration minute = Duration.ofMinutes(1); //PT1M 
		Duration tenSeconds = Duration.ofSeconds(10);  //PT10S
		Duration milli = Duration.ofMillis(1); //PT0.001S
		Duration nano = Duration.ofNanos(1);
		
		System.out.println(daily);
		System.out.println(hourly);		
		System.out.println(minute);		
		System.out.println(tenSeconds);		
		System.out.println(milli);		
		System.out.println(nano);
	}

}
