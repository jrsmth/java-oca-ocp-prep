package ex26.hr;

public final class Organisation extends ParentUnit {
	
	private static Organisation organisation;

	private Organisation(String name, String description) {
		super(name, description);
	}
	
	public static Organisation getInstance(String name, String description) {
		if (organisation == null) {
			organisation = new Organisation(name, description);
		}
		return organisation;
	}
	
	@Override
	public void addSubUnit(BusinessUnit subUnit) {
		if(subUnit instanceof Division || subUnit instanceof Board) {
			getSubUnits().add(subUnit);
			System.out.println("success");
		} else {
			System.out.println("Not allowed");
		}
	}
}
