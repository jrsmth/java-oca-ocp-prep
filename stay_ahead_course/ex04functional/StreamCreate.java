package ex04functional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreate {

	public static void main(String[] args) {
		
		Stream<String> empty = Stream.empty(); // count = 0
		Stream<Integer> singleElement = Stream.of(1); // count = 1 
		Stream<Integer> fromArray = Stream.of(1, 2, 3); // count = 2
		fromArray.forEach(System.out::println);

		List<String> list = Arrays.asList("a", "b", "c");
		Stream<String> fromList = list.stream();
		Stream<String> fromListParallel = list.parallelStream();
		fromList.forEach(System.out::println);
		
		Stream<Double> randoms = Stream.generate(Math::random);
		Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);
		//oddNumbers.forEach(System.out::println);
		
	}

}
