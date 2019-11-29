package ex03generics;

import java.util.ArrayList;
import java.util.List;

public class Wrappers {

	public static void main(String[] args) {
		
		List<Integer> numberList = new ArrayList<Integer>();
		numberList.add(1);
		numberList.add(new Integer(3));
		numberList.add(new Integer(5));
		numberList.remove(1);
		numberList.remove(new Integer(5));
		System.out.println(numberList);

	}

}
