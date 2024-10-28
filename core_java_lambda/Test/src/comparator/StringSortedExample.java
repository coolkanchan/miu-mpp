package comparator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringSortedExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Banana", "Apple", "Mango", "blueberry", "Cherry", "Orange", "straberry", "yum");

        // Sorting strings in ascending order using sorted()
        List<String> sortedStrings = strings.stream()
                                            .sorted()
                                            .collect(Collectors.toList());

        System.out.println("Sorted in Ascending Order: " + sortedStrings);
        
        
     // Sorting strings in descending order using sorted()
        List<String> sortedStringss = strings.stream()
                                            .sorted((s1, s2) -> s2.compareTo(s1))
                                            .collect(Collectors.toList());

        System.out.println("Sorted in Descending Order: " + sortedStringss);
        
        // Sorting strings in descending order using sorted()
        List<String> sortedStringssss = strings.stream()
                                            .sorted((s1, s2) -> s1.length() - s2.length())  // .sorted(Comparator.comparing(String::length))//working
                                            .collect(Collectors.toList());

        System.out.println("Sorted in Descending Order sortedStringssss: " + sortedStringssss);
        
        // Sorting strings in ascending order using method reference
        List<String> sortedStringsss = strings.stream()
                                            .sorted(String::compareTo)
                                            .collect(Collectors.toList());

        System.out.println("Sorted in Ascending Order: " + sortedStringsss);
    }
}
