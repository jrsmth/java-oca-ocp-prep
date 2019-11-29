package ex07concurrency;

import java.util.concurrent.RecursiveAction;
import java.util.concurrent.ThreadLocalRandom;

public class RandomInitRecursiveAction extends RecursiveAction {
	private static final int THRESHOLD = 10000;
	private int[] data;
	private int start;
	private int end;

	public RandomInitRecursiveAction(int[] data, int start, int end) {
		this.data = data;
		this.start = start; // where does our section begin at?
		this.end = end; // how large is this section?
	}

	@Override
	protected void compute() {
		if (end - start <= THRESHOLD) {
			// is it a manageable amount of work?
			// do the task
			for (int i = start; i < end; i++) {
				data[i] = ThreadLocalRandom.current().nextInt();
			}
		} else { // task too big, split it
			int halfWay = ((end - start) / 2) + start;
			RandomInitRecursiveAction a1 = new RandomInitRecursiveAction(data, start, halfWay);
			a1.fork();
			// queue left half of task
			RandomInitRecursiveAction a2 = new RandomInitRecursiveAction(data, halfWay, end);
			a2.compute(); // work on right half of task
			a1.join(); // wait for queued task to be complete
		}
	}
}