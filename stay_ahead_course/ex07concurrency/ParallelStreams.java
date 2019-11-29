package ex07concurrency;

import java.util.Arrays;

public class ParallelStreams {

	public static void main(String[] args) {
		
		System.out.println("Serial");
		Arrays.asList(1,2,3,4,5,6)
		.stream()
		.forEach(s -> System.out.print(s+" "));
		
		System.out.println("\nParallel");		
		Arrays.asList(1,2,3,4,5,6)
		.parallelStream()
		.forEach(s -> System.out.print(s+" "));
		
		System.out.println("\nParallel but ordered");		
		Arrays.asList(1,2,3,4,5,6)
		.parallelStream()
		.forEachOrdered(s -> System.out.print(s+" "));
	}

}
