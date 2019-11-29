package ex01classdesign.finance;

import java.time.LocalDate;

public class ComputerAsset extends Asset {
	private String type;
	private float powerRating;
	private LocalDate purchaseDate;

	public ComputerAsset(String name, String description) {
		super(name, description);
	}

	public float calcAnnualCost() {
		System.out.println("ComputerAsset calcAnnualCost()");
		return 2.0F;
	}
}
