package ex09nio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class DirectorySearch {

	public static void main(String[] args) {

		Path path = Paths.get("/Work");
		long dateFilter = 1420070400000l;
		try {
			Stream<Path> stream = Files.find(path, 10, 
					(p, a) -> p.toString().endsWith(".xml") 
					&& a.lastModifiedTime().toMillis() > dateFilter);
			stream.forEach(System.out::println);
		} catch (Exception e) {
			// Handle file I/O exception...
		}

	}

}
