package map_flatmap;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapFlatMapExample {
    public static void main(String[] args) {
        List<String> sentences = Arrays.asList("Hello world", "Java stream", "Map and flatMap");

        // Using map() and flatMap() to split the strings and flatten the result
        List<String> words = sentences.stream()
                .map(sentence -> sentence.split(" "))  // Split each sentence into an array of words
                .flatMap(Arrays::stream)  // Flatten the arrays into a single stream of words
                .collect(Collectors.toList());

        System.out.println(words);  // Output: [Hello, world, Java, stream, Map, and, flatMap]
        
        // map example
        
        List<String> mapexample = Arrays.asList("apple", "banana", "cherry");
        List<Integer> lengths = mapexample.stream()
                                     .map(String::length)
                                     .collect(Collectors.toList());
        System.out.println(lengths); // Output: [5, 6, 6]
        
        
        List<List<String>> listOfLists = Arrays.asList(
        	    Arrays.asList("apple", "banana"),
        	    Arrays.asList("cherry", "date"),
        	    Arrays.asList("fig", "grape")
        	);

        // flatmap example
        
        	List<String> flatList = listOfLists.stream()
        	                                   .flatMap(list -> list.stream())
        	                                   .collect(Collectors.toList());

        	System.out.println(flatList);  // Output: [apple, banana, cherry, date, fig, grape]
        	
      
        	
        	
        	Stream<String> string = Stream.of("A", "good", "day");
        	
        	String s = string.reduce("", (a,b)-> a+" "+b);
        	System.out.println(s);

     
        
    }
}
