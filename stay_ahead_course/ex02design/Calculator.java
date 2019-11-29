package ex02design;

public class Calculator {
	  
	public int doOperations (int x, int y, IntegerOperations op) {
		return op.calc(x, y);
	}

	public static void main(String... args) {
		Calculator myApp = new Calculator();
		IntegerOperations addition = (x, y) -> x + y;
		IntegerOperations subtraction = (x, y) -> x - y;
		System.out.println("10 + 5 = " +
			myApp.doOperations(10, 5, addition));
		System.out.println("10 - 5 = " +
			myApp.doOperations(10, 5, subtraction));    
	}
}

