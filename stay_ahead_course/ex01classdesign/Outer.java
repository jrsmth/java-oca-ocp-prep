package ex01classdesign;

public class Outer {
	private int repeat = 5;

	protected class Inner {
		public void go() {
			for (int i = 0; i < repeat; i++) {
				System.out.println("Inner.go()");
			}
		}
	}

	public void callInner() {
		Inner inner = new Inner();
		inner.go();
	}

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.callInner();
	}
}
