package ex08io;

import java.io.File;

public class FileSample {
	public static void main(String[] args) {
		
		//identify the separator
		System.out.println(File.separator);
		
		//find a file
		File file = new File("/home/data/Data.txt");
		System.out.println(file.exists());

		//use a parent
		File parent = new File("/home");
		File child = new File(parent,"data/Data.txt");

	}
}
