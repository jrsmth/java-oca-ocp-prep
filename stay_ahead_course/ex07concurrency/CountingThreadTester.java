package ex07concurrency;

public class CountingThreadTester {
	static class CountingThread extends Thread {
		private int start, finish;

		public CountingThread(int from, int to) {
			this.start = from;
			this.finish = to;
		}

		// The first method to go on the new thread's stack must be called run()
		// The JVM thread scheduler decides when to run it
		public void run() {
			System.out.println(this.getName() + " started executing...");
			for (int i = start; i <= finish; i++) {
				System.out.print(i + " ");
			}
			System.out.println(this.getName() + " finished executing.");
		}
	}

	public static void main(String[] args) {
		// These threads are new instances, but they can't start yet
		CountingThread thread0 = new CountingThread(1, 100);
		CountingThread thread1 = new CountingThread(200, 300);

		// The start() method places makes the thread runnable
		thread0.start();
		thread1.start();

	}
}
