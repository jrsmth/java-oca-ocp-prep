package ex03generics;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Merge {

	public static void main(String[] args) {

		BiFunction<String, String, String> mapper = (v1, v2) -> v1.length() > v2.length() ? v1 : v2;

		Map<String, String> movieStars = new HashMap<>();
		movieStars.put("Spy", "Melissa McCarthy");
		movieStars.put("Burnt", "Bradley Cooper");

		String spy = movieStars.merge("Spy", "Jude Law", mapper);
		String burnt = movieStars.merge("Burnt", "Sienna Miller", mapper);

		System.out.println(movieStars);
		System.out.println(spy);
		System.out.println(burnt);

	}

}
