package ex04functional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamTerminal {

	public static void main(String[] args) {
		//count
		Stream<String> s = Stream.of("uno", "dos", "tres", "cuatro"); 
		System.out.println(s.count()); // 4
		
		//min
		s = Stream.of("uno", "dos", "tres", "cuatro"); 
		Optional<String> min = s.min((s1, s2) -> s1.length()-s2.length()); 
		min.ifPresent(System.out::println); // uno 
		
		//findAny
		s = Stream.of("a", "b", "c"); 
		Stream<String> infinite = Stream.generate(() -> "x");
		s.findAny().ifPresent(System.out::println); // a
		infinite.findAny().ifPresent(System.out::println); // x
		
		//allMatch, anyMatch, noneMatch
		List<String> list = Arrays.asList("7E", "CF6", "H75");
		infinite = Stream.generate(() -> "X-250");
		Predicate<String> pred = x -> Character.isLetter(x.charAt(0)); 
		System.out.println(list.stream().anyMatch(pred)); // true 
		System.out.println(list.stream().allMatch(pred)); // false 
		System.out.println(list.stream().noneMatch(pred)); // false 
		System.out.println(infinite.anyMatch(pred)); // true

		//forEach
		s = Stream.of("Funk", "Heinkel", "Sauer"); 
		s.forEach(System.out::print); // FunkHeinkelSauer 
		
	}

}
