package ex08io;

import java.io.*;
import java.util.*;

public class SerialisePayments {
	public static List<Payment> getPayments(File dataFile) throws IOException, ClassNotFoundException {
		List<Payment> payments = new ArrayList<Payment>();
		try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(dataFile)))) {
			while (true) {
				Object object = in.readObject();
				if (object instanceof Payment) {
					payments.add((Payment) object);
				}
			}
		} catch (EOFException e) { // File end reached
			// No action taken
		}
		return payments;
	}

	public static void createPaymentsFile(List<Payment> payments, File dataFile) throws IOException {
		try (ObjectOutputStream out = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream(dataFile)))) {
			for (Payment payment : payments) {
				out.writeObject(payment);
			}
		}
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		List<Payment> payments = new ArrayList<Payment>();
		payments.add(new Payment("Office Supplies", 672.00F));
		payments.add(new Payment("Pippa's Pizza", 897.01F));
		File dataFile = new File("payment.data");
		createPaymentsFile(payments, dataFile);
		System.out.println(getPayments(dataFile));
	}
}
