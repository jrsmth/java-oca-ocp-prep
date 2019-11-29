package ex26.hr;

public class Team extends ParentUnit implements Transferable {

	private ParentUnit parentUnit;
	private Post teamLeader;

	public Team(String name, String description, ParentUnit parentUnit, Post teamLeader) {
		super(name, description);
		this.parentUnit = parentUnit;
		this.teamLeader = teamLeader;
	}

	public ParentUnit getParentUnit() {
		return parentUnit;
	}

	@Override
	public int getHeadCount() {
		int headCount = 0;
		if (teamLeader != null) {
			headCount = 1;
		}
		headCount = headCount + getPosts().size();
		for(BusinessUnit subUnit : getSubUnits()) {
			headCount = headCount + subUnit.getHeadCount();
		}
		return headCount;
	}
	
	public Post getTeamLeader() {
		return teamLeader;
	}

	@Override
	public void transfer(BusinessUnit bu) {
		if(bu instanceof Division || bu instanceof Department) {
			parentUnit.removeSubUnit(this);
			if(bu instanceof Division) {
				((Division) bu).addSubUnit(this);
				parentUnit = (Division) bu;
			}
			if(bu instanceof Department) {
				((Department) bu).addSubUnit(this);
				parentUnit = (Department) bu;
			}
		}
	}
}
