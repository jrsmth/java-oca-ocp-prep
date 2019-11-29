package ex05dates;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class InstantTest {

	public static void main(String[] args) {
		
		Instant start = Instant.now(); 
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Instant finish = Instant.now();
		Duration duration = Duration.between(start, finish); System.out.println(duration.toMillis());

		Instant nextDay = Instant.now().plus(1, ChronoUnit.DAYS); 
		System.out.println(nextDay); // 2015–05–26T15:55:00Z
		Instant nextHour = Instant.now().plus(1, ChronoUnit.HOURS); 
		System.out.println(nextHour); // 2015–05–25T16:55:00Z
		//Instant nextWeek = Instant.now().plus(1, ChronoUnit.WEEKS);
	}

}
