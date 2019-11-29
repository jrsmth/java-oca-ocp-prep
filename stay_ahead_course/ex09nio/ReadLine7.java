package ex09nio;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadLine7 {

	public static void main(String[] args) throws IOException {
		Path p = Paths.get("C:/MyFile.txt");
		List <String> lines = Files.readAllLines(p, Charset.defaultCharset());
		
		for (int i = 0; i < lines.size(); i++)
			System.out.println(lines.get(i));
	}
	
}
