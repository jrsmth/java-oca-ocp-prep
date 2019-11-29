package ex04functional;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Predicates {

	public static void main(String[] args) {
		
		Predicate<String> p1 = String::isEmpty;
		Predicate<String> p2 = x -> x.isEmpty();
		System.out.println(p1.test("")); 
		System.out.println(p2.test(""));

		BiPredicate<String, String> b1 = String::endsWith;
		BiPredicate<String, String> b2 = (string, prefix) -> string.endsWith(prefix);
		System.out.println(b1.test("Volleyball", "ball")); 
		System.out.println(b2.test("Basketball", "ball"));

	}

}
