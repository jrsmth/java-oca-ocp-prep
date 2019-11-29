package ex04functional;

import java.util.Arrays;
import java.util.List;

public class StreamPipeline {

	public static void main(String[] args) {
		
		List<String> list = 
				Arrays.asList("uno", "dos", "tres", "cuatro", "cinco", "seis"); 
				list.stream()
					.filter(n -> n.length() == 4)
					.sorted()
					.limit(2).forEach(System.out::println);

	}

}
