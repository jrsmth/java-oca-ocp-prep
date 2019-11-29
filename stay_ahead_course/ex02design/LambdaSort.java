package ex02design;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaSort {

	public static void main(String[] args) {

		String[] testStrings = {"Yada","Whatevah","Blabber"};
		
		Arrays.sort(testStrings , new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return (s1.length() - s2.length());
			}
		});
		
//		1. Remove interface and method names:
//		The API tells Java that the second argument to Arrays.sort is a Comparator, so we don't need to specify it. 
//		Comparator has only one method, so we don't	need to say that method name is compare.
//		We can use the -> operator and say:
		Arrays.sort(testStrings,(String s1, String s2) -> { 
			return(s1.length() - s2.length()); 
		});

		
//		2. Remove parameter type declarations:
//		By looking at the first argument (testStrings), Java can infer that the type of the second argument is Comparator<String>:
		Arrays.sort(testStrings,(s1, s2) -> { 
			return(s1.length() - s2.length()); 
		});
		
//		3. Replace the code block with an expression:
//		Usually a method body can be written as a single return statement, so the curly brackets and “return”, can be replaced:
		Arrays.sort(testStrings,(s1, s2) -> (s1.length() - s2.length()));
		
		for (String s : testStrings) {
			System.out.println(s);
		}
	}
}
