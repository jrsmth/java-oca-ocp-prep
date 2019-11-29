package ex07concurrency;

import java.util.concurrent.*;

public class InfoSource {
	public static void main(String[] args) {
		ExecutorService service = null;
		try {
			//With a single-thread executor, results are guaranteed to be executed 
			//in the order in which they are added to the executor service
			service = Executors.newSingleThreadExecutor();
			System.out.println("begin");
			service.execute(() -> System.out.println("Printing stock"));
			service.execute(() -> {
				for (int i = 0; i < 3; i++)
					System.out.println("Printing record: " + i);
			});
			service.execute(() -> System.out.println("Printing report"));
			System.out.println("end");
		} finally {
			if (service != null)
				service.shutdown();
		}
	}
}