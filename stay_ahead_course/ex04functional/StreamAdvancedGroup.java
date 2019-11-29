package ex04functional;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAdvancedGroup {

	public static void main(String[] args) {
		
		//group
		Stream<String> moves = Stream.of("forward", "left", "back"); 
		Map<Integer, List<String>> map = moves.collect(Collectors.groupingBy(String::length)); 
		System.out.println(map); 

		moves = Stream.of("forward", "left", "back");  
		TreeMap<Integer, Set<String>> tmap = moves.collect(
		Collectors.groupingBy(String::length, TreeMap::new, Collectors.toSet())); 
		System.out.println(tmap); 
		
		//partition
		moves = Stream.of("forward", "left", "back");  
		Map<Boolean, List<String>> pmap = moves.collect(Collectors.partitioningBy(s -> s.length() <= 5)); //change to 7
		System.out.println(pmap); 

	}

}
