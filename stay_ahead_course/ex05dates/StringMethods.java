package ex05dates;

public class StringMethods {

	public static void main(String[] args) {
		String s1 = "123456789 ten";
		String s2 = "123456789 TEN";
		System.out.println("String s1 is:  " + s1);
		System.out.println("Is s1 = s2?    " + s1.equals(s2));
		System.out.println("ignoring case? " + s1.equalsIgnoreCase(s2));
		System.out.println("Length of s1:  " + s1.length());
		System.out.println("Character at position 1 is: " + s1.charAt(1));
		System.out.println("Substring from position 7 is: " + s1.substring(6));
		System.out.println("Substring at position 7-9 is: " + s1.substring(6,9));
		System.out.println("Replacing some characters: " + s1.replace(" ten", "10"));
		System.out.println("s1 in upper case is: " + s1.toUpperCase());
		
		StringBuilder sb = new StringBuilder("0123456789");
		System.out.println(sb.delete(4,6)); 
	}
}
