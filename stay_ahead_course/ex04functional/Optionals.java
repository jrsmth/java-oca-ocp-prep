package ex04functional;

import java.util.Optional;

public class Optionals {

	public static Optional<Double> average(int... scores) {
		if (scores.length < 3) {
			return Optional.empty();
		}
		int sum = 0;
		for (int score : scores) {
			sum += score;
		}
		return Optional.of((double) sum / scores.length);
	}

	public static void main(String[] args) {
		
		System.out.println(average(9050, 11070, 8920)); // Optional[9680.0]
		System.out.println(average(9050, 11070)); // Optional.empty 
		System.out.println(average()); // Optional.empty
		
		Optional<Double> opt = average(90, 100, 110); 
		if (opt.isPresent()){
			System.out.println(opt.get()); 
		}

	}

}
