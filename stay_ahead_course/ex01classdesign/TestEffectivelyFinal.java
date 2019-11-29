package ex01classdesign;

public class TestEffectivelyFinal {
	public static void main(String[] args) {
		testFinal(31, 37);
	}

	public static void testFinal(int x, int y) {
		int i = 5;
		int j = i;
		j++;
		int k;
		if (i == 7) {
			k = 11;
		} else {
			k = 13;
		}
		int m;
		class LocalInner {
			public void innerMethod() {
				// System.out.println(x);
				System.out.println(y);
				System.out.println(i);
				//System.out.println(j);
				System.out.println(k);
				// System.out.println(m);
			}
		}
		// m = 19;
		x = y;
		new LocalInner().innerMethod();
	}
}
