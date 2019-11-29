package ex02design.fi;

public class Employee {
	private String firstName;
	private String lastName;
	private float grade;
	private String department;

	public Employee(String firstName, String lastName, float grade, String department) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", grade=" + grade + ", department="
				+ department + "]";
	}

	public String getDepartment() {
		return department;
	}

	public float getGrade() {
		return grade;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	
}
