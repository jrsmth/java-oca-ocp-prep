package ex26.hrsystem;

import java.time.LocalDate;

import ex26.hr.Employee;
import ex26.hr.EmployeeBuilder;

public class EmployeeBuilderTest {

	public static void main(String[] args) {
		EmployeeBuilder builder = new EmployeeBuilder();
		builder.setFirstName("Doctor");
		builder.setLastName("Devious");
		builder.setEmployeeId(97);
		builder.setDateOfBirth(LocalDate.of(1954, 9, 30));
		builder.setStartDate(LocalDate.now());
		
		Employee employee = builder.build();
		System.out.println(employee);
		
	}
}
