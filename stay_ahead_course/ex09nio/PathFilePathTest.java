package ex09nio;

import java.nio.file.*;

public class PathFilePathTest {
	public static void printPathInformation(Path path) {
		System.out.println("Filename is: " + path.getFileName());
		System.out.println("Root is: " + path.getRoot());
		Path currentParent = path;
		while ((currentParent = currentParent.getParent()) != null) {
			System.out.println(" Current parent is: " + currentParent);
		}
	}

	public static void main(String[] args) {
		for (String fileName : args) {
			printPathInformation(Paths.get(fileName));
			System.out.println();
		}
	}
}
