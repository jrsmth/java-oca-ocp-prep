package ex04functional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamAdvanced {

	public static void main(String[] args) {

		// linking
		List<String> departments = new ArrayList<>();
		departments.add("HR");
		departments.add("IT");
		Stream<String> stream = departments.stream();
		departments.add("Sales");
		System.out.println(stream.count());

		// chaining optionals
		threeDigit(Optional.of(456));
	}

	private static void threeDigit(Optional<Integer> optional) {
		if (optional.isPresent()) { // outer if
			Integer num = optional.get();
			String string = "" + num;
			if (string.length() == 3) { // inner if
				System.out.println(string);
			}
		}
//		optional.map(n -> "" + n) // part 1
//			.filter(s -> s.length() == 3) // part 2
//			.ifPresent(System.out::println); // part 3

	}

}
