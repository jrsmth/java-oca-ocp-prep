package ex08io;

import java.io.*;

import java.util.*;

public class DateRead {

	public static void main(String[] args) throws Exception {

		Date d = null;
		String s = null;

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("c:\\java\\dateFile.dat"));
		s = (String) ois.readObject();
		d = (Date) ois.readObject();
		ois.close();

		System.out.println("The message is: " + s);
		System.out.println("The date is: " + d);
	}

}