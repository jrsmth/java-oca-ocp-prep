package ex01classdesign;

public class TestSuperSub {
	public static void main(String[] args) {
		SuperClass superClass = new SuperClass();
		SubClass subClass = new SubClass();
		System.out.println("superClass number = " + superClass.number);
		System.out.println("subClass number = " + subClass.number);
		// That much is fairly predictable
		// System.out.println("subClass super.number = " + subClass.super.number);
		// You might even have guessed how that would work but...
		superClass = subClass; // OK because subClass IS-A SuperClass
		System.out.println("superClass number = " + superClass.number);
		// Now we get the SuperClass’s number variable (1) printed!

	}

}
