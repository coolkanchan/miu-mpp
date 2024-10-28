package reduce;

import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class LambdaLibrary {
    public static final BiFunction<List<Employee>, Integer, String> filterAndSortEmployees =
        (employees, salaryThreshold) -> employees.stream()
            .filter(e -> e.getSalary() > salaryThreshold) // Filter employees with salary > threshold
            .filter(e -> e.getLastName().charAt(0) >= 'N') // Last name starts with N-Z
            .map(e -> e.getFirstName() + " " + e.getLastName()) // Create full name
            .sorted() // Sort the names
            .collect(Collectors.joining(", ")); // Join with comma
}

