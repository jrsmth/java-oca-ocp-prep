package ex09nio;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {

	public static void main(String[] args) {

		Path path1 = Paths.get("demo/picture.jpg");
		Path path2 = Paths.get("c:\\home\\Nov\\schedule.csv");
		Path path3 = Paths.get("/home/Nov");

		Path path4 = FileSystems.getDefault().getPath("demo/Text.txt");
		Path path5 = FileSystems.getDefault().getPath("c:", "home", "Nov", "schedule.csv");
		Path path6 = FileSystems.getDefault().getPath("/home/Nov");

		Path path = Paths.get("/demo/code/List.txt");
		System.out.println("The Path Name is: " + path);
		for (int i = 0; i < path.getNameCount(); i++) {
			System.out.println(" Element " + i + " is: " + path.getName(i));
		}

	}

}
