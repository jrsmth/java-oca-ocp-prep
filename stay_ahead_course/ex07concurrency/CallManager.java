package ex07concurrency;

import java.util.concurrent.*;

public class CallManager {
	private int callCount = 0;

	private void incrementAndReport() {
		System.out.print((++callCount) + " ");
	}

	public static void main(String[] args) {
		ExecutorService service = null;
		try {
			service = Executors.newFixedThreadPool(20);
			CallManager manager = new CallManager();
			for (int i = 0; i < 10; i++) {
				service.submit(() -> manager.incrementAndReport());
			}
		} finally {
			if (service != null)
				service.shutdown();
		}
	}
}
