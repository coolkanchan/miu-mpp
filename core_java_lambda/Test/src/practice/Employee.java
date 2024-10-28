package practice;

import java.util.Objects;

public class Employee {
	private String name;
	private int salary;
	
	
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override 
	public String toString() {
		return "(" + name + ", " + salary + ")";
	}
	
//	public boolean equals(Employee e) {
//		return e.name.equals(name) && e.salary == salary;
//	}
	
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;  // same reference
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; // not the same class or null
        }
        Employee employee = (Employee) obj;
        return salary == employee.salary && name.equals(employee.name);
    }
	
//	@Override
//	public int hashCode() {
//	    return Objects.hash(name, salary);  // Generates a hash code based on the fields
//	}
}
