import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableListExample {
    public static void main(String[] args) {
        // Create a mutable list
        List<String> mutableList = new ArrayList<>();
        mutableList.add("Apple");
        mutableList.add("Banana");
        mutableList.add("Orange");

        // Create an unmodifiable list
        List<String> unmodifiableList = Collections.unmodifiableList(mutableList);

        System.out.println("Unmodifiable list: " + unmodifiableList);

        // Attempting to modify the unmodifiable list will throw an exception
        try {
            unmodifiableList.add("Grapes");
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot modify unmodifiable list!");
        }

        // However, if you modify the original list, the changes are reflected in the unmodifiable list
        mutableList.add("Grapes");
        System.out.println("Updated unmodifiable list: " + unmodifiableList);
    }
}
