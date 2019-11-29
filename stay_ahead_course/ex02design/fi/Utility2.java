package ex02design.fi;

import java.util.ArrayList;
import java.util.List;

public class Utility2 {
	public static List<Employee> filter(List<Employee> list, Test<Employee> test) {
		List<Employee> filtered = new ArrayList<>();
		for (Employee e : list) {
			if (test.test(e)) {
				filtered.add(e);
			}
		}
		return filtered;
	}
}
