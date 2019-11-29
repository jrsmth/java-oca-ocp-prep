package ex04functional;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTerminalCollect {

	public static void main(String[] args) {
		
		Stream<String> stream = Stream.of("a", "b", "c", "d"); 
		StringBuilder word = stream.collect(StringBuilder::new,
		StringBuilder::append, StringBuilder::append);
		System.out.println(word);

		stream = Stream.of("a", "c", "b", "d");
		TreeSet<String> set = stream.collect(TreeSet::new, 
		TreeSet::add, TreeSet::addAll);
		System.out.println(set); // [a, b, c, d]
		
		stream = Stream.of("a", "c", "b", "d");
		set = stream.collect(Collectors.toCollection(TreeSet::new)); 
		System.out.println(set); // [a, b, c, d]

	}

}
