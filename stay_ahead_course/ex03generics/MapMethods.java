package ex03generics;

import java.util.HashMap;
import java.util.Map;

public class MapMethods {

	public static void main(String[] args) {
		Map<String, String> movieStars = new HashMap<>();
		
		movieStars.put("Legend", "Tom Hardy");
		movieStars.put("Sicario", null);
		movieStars.put("Legend", "Emily Browning");
		//movieStars.putIfAbsent("Sicario", "Emily Blunt");
		System.out.println(movieStars); 

		
	}

}
