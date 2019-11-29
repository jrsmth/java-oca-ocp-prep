package ex07concurrency;

public class CheckResults1 {
	private static int counter = 0;

	public static void main(String[] args) throws InterruptedException {
		new Thread(() -> {
			for (int i = 0; i < 500; i++)
				CheckResults1.counter++;
		}).start();
		while (CheckResults1.counter < 100) {
			System.out.println("Not reached yet");
			Thread.sleep(1000); // 1 SECOND
		}
		System.out.println("Reached!");
	}
}
