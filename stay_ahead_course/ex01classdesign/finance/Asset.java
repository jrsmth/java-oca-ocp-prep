package ex01classdesign.finance;

import java.time.LocalDate;

public abstract class Asset {
	private String name;
	private String description;

	public Asset(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public abstract float calcAnnualCost();
}

