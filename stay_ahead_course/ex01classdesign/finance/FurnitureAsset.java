package ex01classdesign.finance;

public class FurnitureAsset extends Asset {
	private String type;

	public FurnitureAsset(String name, String description) {
		super(name, description);
	}

	public float calcAnnualCost() {
		System.out.println("FurnitureAsset calcAnnualCost()");
		return 4.0F;
	}
}
