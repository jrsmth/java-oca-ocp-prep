package ex08io;

import java.io.*;

import java.util.*;

public class DateWrite {

	public static void main(String[] args) throws Exception {

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("c:\\java\\dateFile.dat"));
		oos.writeObject("Stayahead JVP");
		oos.writeObject(new Date());
		oos.close();

	}

}