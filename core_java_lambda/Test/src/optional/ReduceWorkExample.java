package optional;

import java.util.Optional;

public class ReduceWorkExample {
    public static void main(String[] args) {
        String name = null;

        // Provide a default value if the name is null
        String result = Optional.ofNullable(name)
                                .orElse("Default Name");
        System.out.println(result); // Output: Default Name

        // Use map to transform and print if the value is present
        Optional.ofNullable("John")
                .map(String::toUpperCase)
                .ifPresent(System.out::println); // Output: JOHN

        // Use orElseGet to lazily compute a value only if needed
        String lazyResult = Optional.ofNullable(name)
                                    .orElseGet(() -> expensiveComputation());
        System.out.println(lazyResult);
    }

    private static String expensiveComputation() {
        System.out.println("Performing expensive computation...");
        return "Computed Name";
    }
}
