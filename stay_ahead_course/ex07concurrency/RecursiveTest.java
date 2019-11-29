package ex07concurrency;

import java.util.concurrent.ForkJoinPool;

public class RecursiveTest {

	public static void main(String[] args) {
		
		int[] data = new int[10_000_000];
		ForkJoinPool fjPool = new ForkJoinPool();
		RandomInitRecursiveAction action = new RandomInitRecursiveAction(data, 0, data.length);
		fjPool.invoke(action);
		System.out.println("Finished");
	}

}
