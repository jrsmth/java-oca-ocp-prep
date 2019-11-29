package ex07concurrency;

import java.util.concurrent.RecursiveTask;

public class FindMaxPositionRecursiveTask extends RecursiveTask<Integer> {
	private static final int THRESHOLD = 10000;
	private int[] data;
	private int start;
	private int end;

	public FindMaxPositionRecursiveTask(int[] data, int start, int end) {
		this.data = data;
		this.start = start;
		this.end = end;
	}

	@Override
	protected Integer compute() {
		// return type Integer matches the <generic> type
		if (end - start <= THRESHOLD) {
			// is it a manageable amount of work?
			int position = 0; // if all values are equal, return position 0
			for (int i = start; i < end; i++) {
				if (data[i] > data[position]) {
					position = i;
				}
			}
			return position;
		} else { // task too big, split it
			int halfWay = ((end - start) / 2) + start;
			FindMaxPositionRecursiveTask t1 = new FindMaxPositionRecursiveTask(data, start, halfWay);
			t1.fork(); // queue left half of task
			FindMaxPositionRecursiveTask t2 = new FindMaxPositionRecursiveTask(data, halfWay, end);
			int position2 = t2.compute(); // work on right half of task
			int position1 = t1.join();
			// wait for queued task to be complete
			// out of the position in two subsection which is greater?
			if (data[position1] > data[position2]) {
				return position1;
			} else if (data[position1] < data[position2]) {
				return position2;
			} else {
				return position1 < position2 ? position1 : position2;
			}
		}
	}
}
