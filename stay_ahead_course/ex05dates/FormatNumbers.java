package ex05dates;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.*;

public class FormatNumbers {
	public static void main(String[] args) throws ParseException {
		int attendeesPerMonth = 8129;
		NumberFormat uk = NumberFormat.getInstance(Locale.UK);
		System.out.println(uk.format(attendeesPerMonth));
		NumberFormat g = NumberFormat.getInstance(Locale.GERMANY);
		System.out.println(g.format(attendeesPerMonth));
		NumberFormat ca = NumberFormat.getInstance(Locale.CANADA_FRENCH);
		System.out.println(ca.format(attendeesPerMonth));
		
		double price = 92807.99;
		NumberFormat ukcurr = NumberFormat.getCurrencyInstance(); 
		System.out.println(ukcurr.format(price));
		
		NumberFormat en = NumberFormat.getInstance(Locale.UK); 
		NumberFormat fr = NumberFormat.getInstance(Locale.FRANCE);
		String s = "40.45"; 
		System.out.println(en.parse(s)); // 40.45 
		System.out.println(fr.parse(s)); // 40
	}
}
