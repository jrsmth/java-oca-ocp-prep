package ex03generics;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapImpl {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();
		map.put("GT", "Guatamala");
		map.put("HU", "Hungary");
		map.put("ET", "Ethiopia");
		map.put("NP", "Nepal");
		map.put("LB", "Lebanon");
		String country = map.get("HU"); // Hungary
		for (String key : map.keySet()) {
			System.out.print(key + " "); // GT ET LB HU NP
		}
		System.out.println();

		Map<String, String> tmap = new TreeMap<>();
		tmap.put("GT", "Guatamala");
		tmap.put("HU", "Hungary");
		tmap.put("ET", "Ethiopia");
		tmap.put("NP", "Nepal");
		tmap.put("LB", "Lebanon");
		country = tmap.get("HU"); // Hungary
		for (String key : tmap.keySet()) {
			System.out.print(key + " "); // ET GT HU LB NP
		}

	}

}
