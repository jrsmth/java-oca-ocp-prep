package ex26.hr;

public class Department extends ParentUnit {
	
	private ParentUnit parentUnit;
	private Post manager;
	
	public Department(String name, String description, ParentUnit parentUnit, Post manager) {
		super(name, description);
		this.parentUnit = parentUnit;
		this.manager = manager;
	}
	
	@Override
	public int getHeadCount() {
		int headCount = 0;
		if (manager != null) {
			headCount = 1;
		}
		headCount = headCount + getPosts().size();
		for(BusinessUnit subUnit : getSubUnits()) {
			headCount = headCount + subUnit.getHeadCount();
		}
		return headCount;
	}
	
	@Override
	public void addSubUnit(BusinessUnit subUnit) {
		if(subUnit instanceof Department || subUnit instanceof Board || subUnit instanceof ExternalUnit)
			getSubUnits().add(subUnit);
		else 
			System.out.println("Not allowed");
	}

	public BusinessUnit getParentUnit() {
		return parentUnit;
	}

	public Post getManager() {
		return manager;
	}

	@Override
	public String toString() {
		return super.toString() + " Department [parentUnit=" + parentUnit + ", manager=" + manager + "]";
	}

}
