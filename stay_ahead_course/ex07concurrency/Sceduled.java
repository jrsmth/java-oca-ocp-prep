package ex07concurrency;

import java.util.concurrent.*;

public class Sceduled {

	public static void main(String[] args) {
		
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		Runnable task1 = () -> System.out.println("Call average:"); 
		Callable<Float> task2 = () -> 4.5F;
		Future<?> result1 = service.schedule(task1, 10, TimeUnit.SECONDS); 
		//Future<?> result2 = service.schedule(task2, 8, TimeUnit.MINUTES);

		service.shutdown();
	}

}
