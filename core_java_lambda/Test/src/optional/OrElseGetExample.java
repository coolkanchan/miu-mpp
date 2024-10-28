package optional;

import java.util.Optional;

public class OrElseGetExample {

	public static void main(String[] args) {
        String defaultValue = "Default Value";

        // Optional with a value
        Optional<String> optionalWithValue = Optional.of("Actual Value");
        String result1 = optionalWithValue.orElseGet(() -> getDefaultValue()); // getDefaultValue() is not evaluated
        System.out.println("Result with orElseGet(): " + result1);

        // Optional without a value
        Optional<String> optionalEmpty = Optional.empty();
        String result2 = optionalEmpty.orElseGet(() -> getDefaultValue()); // getDefaultValue() is evaluated
        System.out.println("Result with orElseGet() (empty): " + result2);
    }

    public static String getDefaultValue() {
        System.out.println("getDefaultValue() is called!");
        return "Default Value";
    }
}