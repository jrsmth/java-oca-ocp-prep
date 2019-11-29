package ex01classdesign;

public class OuterLocal {
	private int length = 7;

	public void calcMethod() {
		final int width = 10;
		class LocalInner {
			public void multiplyMethod() {
				System.out.println(length * width);
			}
		}
		LocalInner localInner = new LocalInner();
		localInner.multiplyMethod();
	}

	public static void main(String[] args) {
		OuterLocal outer = new OuterLocal();
		outer.calcMethod();
	}
}
