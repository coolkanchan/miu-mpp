package reduce;

import java.util.Arrays;
import java.util.List;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class ReduceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    	
    	Stream<String> string = Stream.of("A", "good", "day");
    	
    	String s = string.reduce("", (a,b)-> a+" "+b);
    	System.out.println(s);

    	
    	List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Reduce to sum the numbers
        int sum = numbers.stream()
                         .reduce(0, (a, b) -> a + b);
        
        System.out.println("substraction = "+numbers.stream().reduce(0, (a,b) -> a-b));

        System.out.println("Sum: " + sum); // Output: Sum: 15
        
        long result = LongStream.rangeClosed(256, 1024)
        		.filter(i -> i % 2 == 0)
        		.map(i -> i / 2)
        		.reduce(1, (a, b) -> a * b);
        
        System.out.println("result :  " +result);

	}

}
