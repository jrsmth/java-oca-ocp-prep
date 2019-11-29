package ex01classdesign;

public class TestAnonInner {
	abstract class Super {
		abstract int superMethod();
	}

	public int calc(int x) {
		Super anon = new Super() {
			int superMethod() {
				return 3;
			}
		};
		return x - anon.superMethod();
	}
	
	public static void main(String[] args) {
		int result = new TestAnonInner().calc(7);
		System.out.println(result);
	}
}
