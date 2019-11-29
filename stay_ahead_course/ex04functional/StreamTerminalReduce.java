package ex04functional;

import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class StreamTerminalReduce {

	public static void main(String[] args) {
		//reduce
		String[] array = new String[] { "a", "b", "c", "d" };
		String result = "";
		for (String s : array) {
			result = result + s;
			System.out.println(result);
		}

		Stream<String> stream = Stream.of("a", "b", "c", "d"); 
		String word = stream.reduce("", (s, c) -> s + c);
		//String word = stream.reduce("", String::concat); 
		System.out.println(word); // abcd
		
		Stream<Integer> ints = Stream.of(3, 5, 6);
		System.out.println(ints.reduce(1, (a, b) -> a*b));

		BinaryOperator<Integer> op = (a, b) -> a * b; 
		Stream<Integer> empty = Stream.empty(); 
		Stream<Integer> oneElement = Stream.of(3); 
		Stream<Integer> threeElements = Stream.of(3, 5, 6);
		empty.reduce(op).ifPresent(System.out::print); // no output
		oneElement.reduce(op).ifPresent(System.out::print); // 3
		threeElements.reduce(op).ifPresent(System.out::print); // 90

	}

}
