package comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedNumber {
	
	public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4, 5, -2, 0, -3, -1, -5, -4);

        // Sorting in ascending order using sorted() with lambda
        List<Integer> sortedNumbers = numbers.stream()
                                             .sorted((n1, n2) -> n1 - n2)
                                             .collect(Collectors.toList());
        System.out.println("Sorted in Ascending Order: " + sortedNumbers);
        
        List<Integer> numberee = numbers.stream().sorted(Comparator.comparingInt(Math::abs)).collect(Collectors.toList());
        System.out.println("Sorted in Ascending Orderrr Math : " + numberee);
        
        
        
        List<Integer> numbereee = numbers.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());

        
        System.out.println("Sorted in Ascending naturalOrder: " + numbereee);
        
        List<Integer> number = Arrays.asList(5, 3, 8, 1, 9, 2);

        // Sorting in descending order using lambda expression
        number.sort((n1, n2) -> n2 - n1);

        System.out.println("Sorted in Descending Order: " + number);
    }

}
