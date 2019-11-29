package ex01classdesign;
import java.time.LocalDate;

import demo.JobRole;
public class Employee {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private float grade;
    private String department;
    private JobRole jobRole; 
    public Employee(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }
    public Employee(String firstName, String lastName, LocalDate dateOfBirth,
                   float grade, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.grade = grade;
        this.department = department;
    }
    public String getDepartment(){
        return department;
    }
    public LocalDate getDateOfBirth(){
        return dateOfBirth;
    }
    public float getGrade(){
        return grade;
    }
    @Override
    public String toString(){
        return "[" + firstName + ", " + lastName + ", " + dateOfBirth + "]";
    }
/*    @Override
    public boolean equals(Object object){
        if(!(object instanceof Employee)){
            return false;
        }
        Employee employee = (Employee)object;
        return (this.firstName.equals(employee.firstName) && 
                this.lastName.equals(employee.lastName) && this.dateOfBirth.equals(employee.dateOfBirth));
    }*/
/*    @Override
    public int hashCode(){
        int hashcode = 5;
        hashcode = 31 * hashcode + firstName.hashCode();
        hashcode = 31 * hashcode + lastName.hashCode();
        hashcode = 31 * hashcode + dateOfBirth.hashCode();
        return hashcode;
    }*/
}