package functionalinterface;

import java.util.function.BiFunction;

import reduce.TriFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        // Example 1: Adding two integers using BiFunction
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        int result1 = add.apply(10, 20);
        System.out.println("Sum of 10 and 20: " + result1); // Output: Sum of 10 and 20: 30
        
        // Example 2: Concatenating two strings using BiFunction
        BiFunction<String, String, String> concatenate = (str1, str2) -> str1 + " " + str2;
        String result2 = concatenate.apply("Hello", "World");
        System.out.println("Concatenated String: " + result2); // Output: Concatenated String: Hello World
        
        // Example 3: Combining two Employee objects and returning a new Employee object
        BiFunction<Employee, Employee, Employee> combineSalaries = (e1, e2) -> 
            new Employee(e1.name + " & " + e2.name, e1.salary + e2.salary);
        
        Employee emp1 = new Employee("John", 50000);
        Employee emp2 = new Employee("Jane", 60000);
        
        Employee combinedEmployee = combineSalaries.apply(emp1, emp2);
        System.out.println("Combined Employee: " + combinedEmployee);
        
    }
}

// Employee class for example
class Employee {
    String name;
    int salary;
    
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    
    @Override
    public String toString() {
        return "<name: " + name + ", salary: " + salary + ">";
    }
}
