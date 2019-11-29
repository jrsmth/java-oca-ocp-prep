package ex01classdesign;
import java.time.LocalDate;
import java.util.ArrayList;
public class TestEmployee {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ali", "Klein", LocalDate.of(1967, 7, 11));
        System.out.println("employee1: " + employee1);
        Employee employee2 = new Employee("Alin", "Klein", LocalDate.of(1967, 7, 11));
        System.out.println("employee2: " + employee2);
        Employee employee3 = new Employee("Ali", "Klein", LocalDate.of(1967, 7, 11));
        System.out.println("employee3: " + employee3);
        System.out.println("employee1.equals(employee2): " + employee1.equals(employee2));
        System.out.println("employee1.equals(employee3): " + employee1.equals(employee3));
        System.out.println("employee1.equals(null): " + employee1.equals(null));
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        System.out.println("employees.contains(employee2): " + employees.contains(employee2));
        System.out.println("employees.contains(employee3): " + employees.contains(employee3));
        System.out.println("employee1.hashCode(): " + employee1.hashCode());
    }
}