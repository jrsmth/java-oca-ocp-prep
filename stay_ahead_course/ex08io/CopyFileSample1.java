package ex08io;

import java.io.*;

public class CopyFileSample1 {
	public static void copy(File source, File destination) throws IOException {
		try (InputStream in = new FileInputStream(source); 
				OutputStream out = new FileOutputStream(destination)) {
			int b;
			while ((b = in.read()) != -1) {
				out.write(b);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		File source = new File(args[0]);
		File destination = new File(args[1]);
		copy(source, destination);
	}
}
