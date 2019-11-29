package ex04functional;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamIntermediate {
	
	public static void main(String[] args) {
		
		//filter
		Stream<String> s = Stream.of("P.XI", "J-16", "S 2500 L");
		s.filter(x -> x.contains("X")).forEach(System.out::println); 

		//distinct
		s = Stream.of("A", "B", "C", "B"); 
		s.distinct().forEach(System.out::println); // ABC
		
		//limit, skip
		Stream<Integer> ints = Stream.iterate(1, n -> n + 1);
		ints.skip(5).limit(2).forEach(System.out::println); // 67
		
		//map
		s = Stream.of("Zhuzhou", "Quick", "Glushenkov"); 
		s.map(String::length).forEach(System.out::println); // 7510

		//flatMap
		List<String> zero = Arrays.asList();
		List<String> one = Arrays.asList("Thruxton");
		List<String> two = Arrays.asList("Wallis", "Gadfly");
		Stream<List<String>> aircraft = Stream.of(zero, one, two);
		aircraft.flatMap(l -> l.stream()).forEach(System.out::println);
		
		//sorted
		s = Stream.of("VTOL:", "STOL:");
		s.sorted().forEach(System.out::print); 
		System.out.println();
		s = Stream.of("VTOL:", "CTOL:", "STOL:");
		s.sorted(Comparator.reverseOrder()).forEach(System.out::print);
		System.out.println();
		
		s = Stream.of("A380", "747", "C-5", "MD-11", "Tu-154M"); 
		long count = s.filter(ls -> ls.contains("4"))
				.peek(System.out::println)
				.count(); 
		System.out.println(count); 

	}

}
