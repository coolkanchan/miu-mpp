package optional;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        String name = "John";    // Non-null value
        String nullName = null;  // Null value
        
        // Using Optional.ofNullable with a non-null value
        Optional<String> optionalName = Optional.ofNullable(name);
        System.out.println("Non-null value: " + optionalName.orElse("No name"));

        // Using Optional.ofNullable with a null value
        Optional<String> optionalNullName = Optional.ofNullable(nullName);
        System.out.println("Null value: " + optionalNullName.orElse("No name"));
        
        // Using isPresent() to check if value is present
        if (optionalName.isPresent()) {
            System.out.println("Name is present: " + optionalName.get());
        } else {
            System.out.println("Name is not present");
        }
    }
}

