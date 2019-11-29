package ex03generics;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetImpl {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		boolean b1 = set.add(66); //true
		boolean b2 = set.add(10); //true
		boolean b3 = set.add(66); //false
		boolean b4 = set.add(8); //true
		for (Integer integer: set){ 
			System.out.print(integer + ","); // 66, 8, 10
		}
		System.out.println();
		
		Set<Integer> tset = new TreeSet<>();
		boolean tb1 = tset.add(66); //true
		boolean tb2 = tset.add(10); //true
		boolean tb3 = tset.add(66); //false
		boolean tb4 = tset.add(8); //true
		for (Integer integer: tset){ 
			System.out.print(integer + ","); // 8, 10, 66
		}

	}

}
