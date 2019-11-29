package ex01classdesign.finance;

import java.util.ArrayList;

public class AssetTest {
	public static void main(String[] args) {
		ArrayList<Asset> assets = new ArrayList<>();
		assets.add(new BuildingAsset("HQ", "Headquarters"));
		assets.add(new ComputerAsset("Server1", "Local Storage Server"));
		assets.add(new VehicleAsset("JAG111", "CEO’s Car"));
		assets.add(new FurnitureAsset("Table1", "Boardroom table"));
		float costs = 0;
		for (Asset asset : assets) {
			costs += asset.calcAnnualCost();
		}
		System.out.print("Cost for " + assets.size() + " assets: ");
		System.out.print(costs);
	}
}
