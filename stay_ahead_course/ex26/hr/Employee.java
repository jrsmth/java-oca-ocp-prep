package ex26.hr;

import java.time.LocalDate;
import java.util.ArrayList;

public class Employee {
	
	private String firstName;
	private String lastName;
	private int employeeId; 
	private LocalDate dateOfBirth;
	private float salary ;
	private LocalDate startDate ;
	private LocalDate endDate ;
	private EmployeeType employeeType ;
	private ArrayList<Assignment> assignments = new ArrayList<>() ;
	private TotalCost totalCost;
	
	{
		totalCost = new TotalCost() {

			@Override
			public float calculateTotalCost(Employee e) {
				float employeeCost = 0;
					e.getEmployeeType();
					switch(e.getEmployeeType()) {
					case PERMANENT: employeeCost = e.getSalary() * 1.75F; break;
					case FIXED_TERM: employeeCost = e.getSalary() * 1.5F; break;
					case INTERN: employeeCost = e.getSalary(); break;
					case CONTRACTOR: employeeCost = e.getSalary(); break;
					}
				return employeeCost;
			}

		};
	}
	
	public Employee(String firstName, String lastName, int employeeId, LocalDate dateOfBirth, LocalDate startDate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeId = employeeId;
		this.dateOfBirth = dateOfBirth;
		this.startDate = startDate;
	}
	
	public Employee(String firstName, String lastName, int employeeId, LocalDate dateOfBirth, LocalDate startDate, TotalCost totalCost) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeId = employeeId;
		this.dateOfBirth = dateOfBirth;
		this.startDate = startDate;
		this.totalCost = totalCost;
	}

	public boolean isCurrent() {
        LocalDate currentDate = LocalDate.now();
        if( (startDate.isBefore(currentDate) || startDate.isEqual(currentDate)) && 
            (endDate == null || endDate.isAfter(currentDate) || endDate.isEqual(currentDate)) ){
            return true;
        }
        return false;
	}
	
	public float getTotalCost() {
		return totalCost.calculateTotalCost(this);
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public float getSalary() {
		return salary;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public EmployeeType getEmployeeType() {
		return employeeType;
	}
	public ArrayList<Assignment> getAssignments() {
		return new ArrayList<Assignment>(assignments);
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

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", employeeId=" + employeeId
				+ ", dateOfBirth=" + dateOfBirth + ", salary=" + salary + ", startDate=" + startDate + ", endDate="
				+ endDate + ", employeeType=" + employeeType + " currently employed= " + isCurrent() + "]";
	}

	@Override
	public int hashCode() {
		return employeeId;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (employeeId != other.employeeId)
			return false;
		return true;
	}
	
}
