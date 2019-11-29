package ex02design.fi;

import java.util.ArrayList;
import java.util.List;

public class Utility {
	public static <T> List<T> filter(List<T> list, Test<T> test) {
		List<T> filtered = new ArrayList<>();
		for (T t : list) {
			if (test.test(t)) {
				filtered.add(t);
			}
		}
		return filtered;
	}
}
