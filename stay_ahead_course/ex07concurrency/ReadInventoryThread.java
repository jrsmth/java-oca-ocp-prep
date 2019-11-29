package ex07concurrency;

public class ReadInventoryThread extends Thread {
	public void run() {
		System.out.println("Reading inventory");
	}

	public static void main(String[] args) {
		(new ReadInventoryThread()).start();
	}
}