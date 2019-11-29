package ex07concurrency;

import java.util.concurrent.*;

public class Add {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService service = null;
		try {
			service = Executors.newSingleThreadExecutor();
			Future<Integer> result = service.submit(() -> 10 + 32);
			System.out.println(result.get());
			service.submit(() -> {
				Thread.sleep(1000); 
				return null;
			});
			service.submit(() -> {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			});
		} finally {
			if (service != null) {
				service.shutdown();
			}
		}
	}
}