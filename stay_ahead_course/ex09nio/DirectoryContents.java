package ex09nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryContents {

	public static void main(String[] args) {
		try {
			Path path = Paths.get("/labs");
			Files.list(path).filter(p -> !Files.isDirectory(p))
					.map(p -> p.toAbsolutePath())
					.forEach(System.out::println);
		} catch (IOException e) {
			// Handle file I/O exception...
		}

	}

}
