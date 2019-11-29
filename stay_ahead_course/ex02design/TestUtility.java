package ex02design;
import java.util.List;

import ex01classdesign.Employee;

import java.util.ArrayList;
import java.time.LocalDate;
public class TestUtility{
    public static void main(String[] args){
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Abi", "Stele", LocalDate.of(1961, 7, 10),
                   5.0F, "IT"));
        employees.add(new Employee("Baz", "Tyco", LocalDate.of(1967, 1, 19),
                   2.5F, "Sales"));
        employees.add(new Employee("Cat", "Polli", LocalDate.of(1950, 12, 3),
                   5.2F, "Sales"));
        employees.add(new Employee("Dot", "Lisle", LocalDate.of(1958, 3, 9),
                   7.0F, "Logistics"));
        employees.add(new Employee("Effy", "Khalt", LocalDate.of(1973, 9, 23),
                   3.0F, "Sales"));
        List<Employee> filtered = Utility.<Employee>filter(employees, e->e.getDepartment() == "Sales");
        for(Employee employee : filtered){
            System.out.println(employee);
        }
        filtered = Utility.<Employee>filter(employees, e->e.getGrade() > 5.0F);
        for(Employee employee : filtered){
            System.out.println(employee);
        }
        //throw new RuntimeException("Hi");
    }

}