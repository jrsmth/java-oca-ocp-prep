package ex03generics;

import java.util.ArrayList;
import java.util.List;

public class ConditionalRemoval {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("PHX");
		list.add("LHR");
		list.add("LAX");
		System.out.println(list); // [LHR, LAX]
		list.removeIf(s -> s.endsWith("X"));
		System.out.println(list); // [LHR]

	}

}
