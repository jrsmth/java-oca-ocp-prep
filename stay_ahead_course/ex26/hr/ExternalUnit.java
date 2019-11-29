package ex26.hr;

public class ExternalUnit extends ParentUnit {

	private ParentUnit parentUnit;

	public ExternalUnit(String name, String description, ParentUnit parentUnit) {
		super(name, description);
		this.parentUnit = parentUnit;
	}

	public ParentUnit getParentUnit() {
		return parentUnit;
	}
}
