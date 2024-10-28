package generic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public class SecondSmallest {
	
	
	

	
	
	public static <T extends Comparable<? super T>> T findSecondSmallest(List<T> ls) {
		
		if(ls.size() <2 || ls == null)
			new NoSuchElementException ("list must content atleast two element ");
		
		   T smallest = null;
	        T secondSmallest = null;

	        for (T element : ls) {
	            if (smallest == null || element.compareTo(smallest) < 0) {
	                secondSmallest = smallest;
	                smallest = element;
	            } else if (secondSmallest == null || (element.compareTo(secondSmallest) < 0 && element.compareTo(smallest) > 0)) {
	                secondSmallest = element;
	            }
	        }

	        if (secondSmallest == null) {
	            throw new NoSuchElementException("No second smallest element found.");
	        }

	        return secondSmallest;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> intList = List.of(10, 4, 7, 3, 8, 9);
        System.out.println("Second smallest: " + findSecondSmallest(intList));

        List<String> strList = List.of("apple", "banana", "pear", "orange", "kiwi");
        System.out.println("Second smallest: " + findSecondSmallest(strList));
		
		

	}

}
