package ex01classdesign;

public class Calc {
	void sum(int a, int b) {
		System.out.println(a + b);
	}

	void sum(long a, long b) {
		System.out.println(a + b);
	}

	public static void main(String args[]) {
		Calc calc = new Calc();
		calc.sum(20, 20); // sum() with int arguments will be called
	}
	
}
