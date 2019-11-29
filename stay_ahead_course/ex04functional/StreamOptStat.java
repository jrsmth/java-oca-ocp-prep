package ex04functional;

import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamOptStat {

	public static void main(String[] args) {

		IntStream stream = IntStream.rangeClosed(1, 10);
		OptionalDouble optional = stream.average();
		optional.ifPresent(System.out::println);
		System.out.println(optional.getAsDouble());
		System.out.println(optional.orElseGet(() -> Double.NaN));

		stream = IntStream.rangeClosed(1, 10);
		System.out.println(max(stream));
		
		stream = IntStream.rangeClosed(1, 10);
		System.out.println(range(stream));
	}

	private static int max(IntStream ints) {
		OptionalInt optional = ints.max();
		return optional.orElseThrow(RuntimeException::new);
	}

	private static int range(IntStream ints) {
		IntSummaryStatistics stats = ints.summaryStatistics();
		if (stats.getCount() == 0) {
			throw new RuntimeException();
		}
		return stats.getMax() - stats.getMin();
	}

}
