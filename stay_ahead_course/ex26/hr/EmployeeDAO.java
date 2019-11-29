package ex26.hr;

import java.time.LocalDate;
import java.util.ArrayList;

public class EmployeeDAO {
	
	private ArrayList<Employee> employees;

	public EmployeeDAO() {
		employees = new ArrayList<>();
		employees.add(new Employee("Tobias","Grungespittle",1001,LocalDate.of(1990, 9, 6), LocalDate.now()));
		employees.add(new Employee("Jimi","Hendrix",1002,LocalDate.of(1950, 7, 8), LocalDate.now()));
		employees.add(new Employee("Herman","Hermit",1003,LocalDate.of(1472, 1, 1), LocalDate.now()));
		employees.add(new Employee("Edgar","Froese",1004,LocalDate.of(2000, 2, 3), LocalDate.now()));
		employees.add(new Employee("Penny","Pincher",1019,LocalDate.of(1990, 9, 6), LocalDate.now()));
		employees.add(new Employee("Peter","Baumann",1005,LocalDate.of(1917, 9, 6), LocalDate.now()));
		employees.add(new Employee("Klaus","Schultz",1006,LocalDate.of(2015, 12, 12), LocalDate.now()));
		employees.add(new Employee("Luciana","Ambridge",1018,LocalDate.of(1996, 1, 6), LocalDate.now()));
		employees.add(new Employee("Fred", "Dread ", 100, LocalDate.of(1980, 9, 6), LocalDate.now()));
		employees.add(new Employee("Marta", "Torres ", 100, LocalDate.of(1980, 9, 6), LocalDate.now()));
	}
	
	public ArrayList<Employee> getEmployees() {
		return new ArrayList<Employee>(employees);
	}
		
}
