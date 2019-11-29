package ex01classdesign.finance;

public class BuildingAsset extends Asset {
	private Location location;
	private float floorSpace;

	public BuildingAsset(String name, String description) {
		super(name, description);
	}

	public float calcAnnualCost() {
		System.out.println("BuildingAsset calcAnnualCost()");
		return 1.0F;
	}
}
