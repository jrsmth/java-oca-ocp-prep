package ex08io;

import java.io.File;

public class ReadFileInformation {
	public static void main(String[] args) {
		File file = new File(args[0]);
		System.out.println("File Exists: " + file.exists());
		if (file.exists()) {
			System.out.println("Absolute Path: " + file.getAbsolutePath());
			System.out.println("Is Directory: " + file.isDirectory());
			System.out.println("Parent Path: " + file.getParent());
			if (file.isFile()) {
				System.out.println("File size: " + file.length());
				System.out.println("File LastModified: " + file.lastModified());
			} else {
				System.out.println("Files in directory:");
				for (File subfile : file.listFiles()) {
					System.out.println("\t" + subfile.getName());
				}
			}
		}
	}
}
