package ex04functional;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAdvancedCollect {

	public static void main(String[] args) {
		
		Stream<String> moves = Stream.of("forward", "left", "back"); 
		String result = moves.collect(Collectors.joining(", "));
		System.out.println(result); 

		moves = Stream.of("forward", "left", "back");
		Double dresult = moves.collect(Collectors.averagingInt(String::length)); 
		System.out.println(dresult); 
		
		moves = Stream.of("forward", "left", "back"); 
		TreeSet<String> tsresult = moves.filter(s -> s.contains("a")).collect(Collectors.toCollection(TreeSet::new));
		System.out.println(tsresult); 

		moves = Stream.of("forward", "left", "back"); 
		Map<Integer, String> map = moves.collect(Collectors.toMap(String::length, k -> k, (s1, s2) -> s1 + "," + s2)); 
		System.out.println(map); 
		System.out.println(map.getClass()); 


	}

}
