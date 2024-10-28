package practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortByAbsoluteValue {
    public static void main(String[] args) {
    	List<String> stringList = Arrays.asList("cba", "efg", "doe", "fie", "set");
    	
    	List<String> sortedList = stringList.stream()
                .sorted((s1, s2) -> Character.compare(s1.charAt(1), s2.charAt(1))).collect(Collectors.toList());

        System.out.println(sortedList);
    }

}