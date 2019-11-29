package ex09nio;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.*;

public class BasicFileAttributeViewSample {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("/Projects/Index.xml");
		BasicFileAttributeView view = Files.getFileAttributeView(path, BasicFileAttributeView.class);
		BasicFileAttributes data = view.readAttributes();
		FileTime lastModifiedTime = FileTime.fromMillis(data.lastModifiedTime().toMillis() + 10_000);
		view.setTimes(lastModifiedTime, null, null);
	}
}
