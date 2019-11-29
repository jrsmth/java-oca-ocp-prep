package ex02design.fi;

import java.util.ArrayList;
import java.util.List;

public class TestUtility {

	public static void main(String[] args) {
		
		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Abi", "Stele", 5.0F, "IT"));
		employees.add(new Employee("Baz", "Tyco", 2.5F, "Sales"));
		employees.add(new Employee("Cat", "Polli", 5.2F, "Sales"));
		employees.add(new Employee("Dot", "Lisle", 7.0F, "Finance"));
		employees.add(new Employee("Effy", "Khalt", 3.0F, "Sales"));
		
		List<Employee> filtered = Utility2.filter(employees, e -> e.getDepartment() == "Sales");
		for (Employee employee : filtered) {
			System.out.println(employee);
		}
		
//		filtered = Utility.<Employee>filter(employees, e -> e.getGrade() > 5.0F);
//		for (Employee employee : filtered) {
//			System.out.println(employee);
//		}

	}

}
