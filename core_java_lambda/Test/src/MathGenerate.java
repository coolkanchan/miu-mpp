import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class MathGenerate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        long count = Stream.generate(Math::random)                   
                .limit(100)                                          // Limit to 100 random doubles
                .map(d -> (int) (d * 101))                           // Map each double to an integer between 0 and 100
                .filter(num -> num % 3 != 0)                         // Filter out numbers divisible by 3
                .count();                                            // Count remaining numbers

        System.out.println("Count of numbers not divisible by 3: " + count);
        
        
        
    	// find first
    	
    	List<String> list = Arrays.asList("apple", "banana", "cherry", "date");
    	Optional<String> firstElement = list.stream().findFirst();
    	System.out.println(firstElement.orElse("No element"));  // Output: apple
    	
    	
    	// find any
    	
    	List<String> list2 = Arrays.asList("apple", "banana", "cherry", "date");
    	Optional<String> anyElement = list2.stream().findAny();
    	System.out.println(anyElement.orElse("No element"));  // Output: apple (in sequential stream)
    	
    	long result = LongStream.rangeClosed(256, 1024)
    		    .filter(i -> i % 2 == 0)
    		    .map(i -> i / 2)
    		    .reduce(1, (a, b) -> a * b) ;
    	
    	System.out.println("reduce = "+ result);

        
        
	}
	
	
	


	

}
