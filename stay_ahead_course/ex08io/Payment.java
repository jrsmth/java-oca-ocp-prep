package ex08io;

import java.io.Serializable;

public class Payment implements Serializable {
	private String name;
	private float amount;

	public Payment(String name, float amount) {
		this.name = name;
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "[" + name + ", " + amount + "]";
	}
}
