package ex05dates;

import java.util.Locale;
import java.util.ResourceBundle;

public class Locales {

	public static void main(String[] args) {
		Locale uk = new Locale("en", "GB");
		Locale france = new Locale("fr", "FR");
		printProperties(uk);
		System.out.println();
		printProperties(france);
	}

	public static void printProperties(Locale locale) {
		//resource bundle files go in the bin directory
		ResourceBundle rb = ResourceBundle.getBundle("translate", locale);
		System.out.println("Page title: " + rb.getString("welcome"));
		System.out.println("Submit button: " + rb.getString("submit"));
		System.out.println("Confirmation: " + rb.getString("thankyou"));
	}

}
