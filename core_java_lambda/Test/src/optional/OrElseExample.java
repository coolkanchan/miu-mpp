package optional;

import java.util.Optional;
import java.util.*;

public class OrElseExample {
	public static void main(String[] args) {
    String defaultValue = "Default Value";
    
    
    List<String> fruits = new ArrayList<>();
    fruits.add("apple");
    fruits.add("banana");
    fruits.add("orange");

    int index = fruits.indexOf("apple");
    System.out.println("index of = "+ index);

    // Optional with a value
    Optional<String> optionalWithValue = Optional.of("Actual Value");
    String result1 = optionalWithValue.orElse(getDefaultValue()); // getDefaultValue() is evaluated even though it's not needed
    System.out.println("Result with orElse(): " + result1);

    // Optional without a value
    Optional<String> optionalEmpty = Optional.empty();
    String result2 = optionalEmpty.orElse(getDefaultValue()); // getDefaultValue() is evaluated only optional is empty
    System.out.println("Result with orElse() (empty): " + result2);
}

public static String getDefaultValue() {
    System.out.println("getDefaultValue() is called!");
    return "Default Value";
}
}