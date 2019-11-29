package ex04functional;

interface Payable {
	String pay();
}

class Payments {
	String customer = "ACME Inc.";

	void MakePayments(boolean internal) {
		String supplier = "Nuts&Bolts";
		// supplier = "RawMat";
		showPayment(() -> customer);
		showPayment(() -> internal ? "Employee" : "Contractor");
		showPayment(() -> supplier);
	}

	void showPayment(Payable p) {
		System.out.println(p.pay());
	}
	
	public static void main(String[] args) {
		Payments payments = new Payments();
		payments.MakePayments(true);
	}
}
