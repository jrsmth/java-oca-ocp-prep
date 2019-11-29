package ex26.hr;

public class Division extends ParentUnit {
	
	private Organisation organisation;
	private Post director;

	public Division(String name, String description, Organisation organisation, Post director) {
		super(name, description);
		this.organisation = organisation;
		this.director = director;
	}
	
	@Override
	public int getHeadCount() {
		int headCount = 0;
		if (director != null) {
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
		if(subUnit instanceof Department || subUnit instanceof Board || subUnit instanceof Team)
			getSubUnits().add(subUnit);
	}

	public BusinessUnit getOrganisation() {
		return organisation;
	}

	public Post getDirector() {
		return director;
	}

	@Override
	public String toString() {
		return super.toString() + " Division [organisation=" + organisation + ", director=" + director + "]";
	}

	
}
