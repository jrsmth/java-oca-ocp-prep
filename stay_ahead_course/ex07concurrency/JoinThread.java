package ex07concurrency;

public class JoinThread implements Runnable {

	public static void main(String[] args) {
		
		System.out.println("Start");
		new JoinThread().doSomething();
		System.out.println("Finish");

	}
	
	private void doSomething() {
		Thread t = new Thread(this);
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		for (int i=1; i <= 100; i++) {
			System.out.println("Iteration " + i);
		}
		
	}

}
