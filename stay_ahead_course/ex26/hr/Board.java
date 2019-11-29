package ex26.hr;

public class Board extends BusinessUnit {

	private Organisation organisation;

	public Board(String name, String description, Organisation organisation) {
		super(name, description);
		this.organisation = organisation;
	}

	public Organisation getOrganisation() {
		return organisation;
	}
}
