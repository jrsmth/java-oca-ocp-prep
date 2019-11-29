package ex26.hr;

import java.time.LocalDate;
import java.util.ArrayList;

public class EmployeeBuilder {

	private String firstName;
	private String lastName;
	private int employeeId;
	private LocalDate dateOfBirth;
	private float salary;
	private LocalDate startDate;
	private LocalDate endDate;
	private EmployeeType employeeType;
	private ArrayList<Assignment> assignments = new ArrayList<>();
	private TotalCost totalCost;
	private Employee employee;

	public Employee build() {
		employee = new Employee(firstName, lastName, employeeId, dateOfBirth, startDate, totalCost);
		setEmployeeType(employeeType);
		setEndDate(endDate);
		setSalary(salary);
		return employee;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public void setTotalCost(TotalCost totalCost) {
		this.totalCost = totalCost;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public void setEmployeeType(EmployeeType employeeType) {
		this.employeeType = employeeType;
	}

	public void setAssignments(ArrayList<Assignment> assignments) {
		this.assignments = assignments;
	}
}
