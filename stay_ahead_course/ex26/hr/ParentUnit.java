package ex26.hr;

import java.util.ArrayList;

public abstract class ParentUnit extends BusinessUnit {
	
	private ArrayList<BusinessUnit> subUnits = new ArrayList<>();

	public ParentUnit(String name, String description) {
		super(name, description);
	}
	
	public void addSubUnit(BusinessUnit bu) {
		subUnits.add(bu);
	}

	public ArrayList<BusinessUnit> getSubUnits() {
		return new ArrayList<BusinessUnit>(subUnits);	
	}
	
	public boolean removeSubUnit(BusinessUnit bu) {
		return subUnits.remove(bu);
	}
}
