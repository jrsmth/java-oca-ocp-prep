package ex03generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> stringList = new ArrayList<>(); 
		stringList.add("First");
		stringList.add("Second");
		String[] stringArray = new String[stringList.size()];
		stringArray[0] = stringList.get(1);
		stringArray[1] = stringList.get(0);
		for (int i = 0; i < stringArray.length; i++)
		System.out.print(stringArray[i] + "-");
		
		String[] array = { "keyboard", "mouse" };
		List<String> list = Arrays.asList(array);
		list.set(1, "pen");
		array[0] = "new";
		String[] array2 = (String[]) list.toArray();
		list.remove(1); 
		
	}

}
