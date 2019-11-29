package ex01classdesign.finance;

public class VehicleAsset extends Asset {
	private String vehicleClass;
	private String fuelType;
	private int engineSize;
	private Contract leaseContract;

	public VehicleAsset(String name, String description) {
		super(name, description);
	}

	public float calcAnnualCost() {
		System.out.println("VehicleAsset calcAnnualCost()");
		return 3.0F;
	}
}
