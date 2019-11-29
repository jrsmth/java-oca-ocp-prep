package ex04functional;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Consumers {

	public static void main(String[] args) {
		
		Consumer<String> c1 = System.out::println; 
		Consumer<String> c2 = x -> System.out.println(x);
		c1.accept("Monitor"); 
		c2.accept("Desktop");
		
		Map<String, Integer> map = new HashMap<>(); 
		BiConsumer<String, Integer> b1 = map::put; 
		BiConsumer<String, Integer> b2 = (k, v) -> map.put(k, v);
		b1.accept("Basketball", 5); 
		b2.accept("Volleyball", 6);
		System.out.println(map);

	}

}
