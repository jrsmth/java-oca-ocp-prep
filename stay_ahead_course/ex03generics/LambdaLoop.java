package ex03generics;

import java.util.Arrays;
import java.util.List;

public class LambdaLoop {

	public static void main(String[] args) {

		List<String> movies = Arrays.asList("Legend", "Spectre", "Sicario", "Spy", "Room", "Pixels");
		for (String movie : movies) {
			System.out.println(movie);
		}
		movies.forEach(c -> System.out.println(c));
		movies.forEach(System.out::println);
	}

}
