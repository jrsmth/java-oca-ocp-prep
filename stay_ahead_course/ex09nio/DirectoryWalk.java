package ex09nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryWalk {

	public static void main(String[] args) {
		
		Path path = Paths.get("/labs");
		try {
		Files.walk(path)
			.filter(p -> p.toString().endsWith(".xml")) 
			.forEach(System.out::println);
		} catch (IOException e) {
		// Handle file I/O exception...
		}

	}

}
