package ex07concurrency;

import java.util.concurrent.ForkJoinPool;

public class RecursiveTaskTest {

	public static void main(String[] args) {
		int[] data = new int[100_000_000];
		ForkJoinPool fjPool = new ForkJoinPool();
		long start = System.currentTimeMillis();
		RandomInitRecursiveAction action = new RandomInitRecursiveAction(data, 0, data.length);
		fjPool.invoke(action);
		// new code begins here
		FindMaxPositionRecursiveTask task = new FindMaxPositionRecursiveTask(data, 0, data.length);
		Integer position = fjPool.invoke(task);
		long finish = System.currentTimeMillis();
		System.out.println("Position: " + position + ", value: " + data[position]);
		System.out.println("In " + (finish - start) + " milliseconds");
	}

}
