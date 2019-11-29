package ex06exceptions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TryWithResources {

	public static void main(String[] args) {
		
		Path path1 = Paths.get("c:/nowhere");
		Path path2 = Paths.get("c:/wherevah");
		
		TryWithResources trw = new TryWithResources();
		try {
			trw.oldApproach(path1, path2);
			trw.newApproach(path1, path2);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

	public void oldApproach(Path path1, Path path2) throws IOException {
		BufferedReader in = null;
		BufferedWriter out = null;
		try {
			in = Files.newBufferedReader(path1);
			out = Files.newBufferedWriter(path2);
			out.write(in.readLine());
		} finally {
			if (in != null)
				in.close();
			if (out != null)
				out.close();
		}
	}

	public void newApproach(Path path1, Path path2) throws IOException {
		try (BufferedReader in = Files.newBufferedReader(path1); BufferedWriter out = Files.newBufferedWriter(path2)) {
			out.write(in.readLine());
		}
	}
}
