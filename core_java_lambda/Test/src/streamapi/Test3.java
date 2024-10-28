package streamapi;
import java.util.*;
import java.util.stream.Stream;
import java.util.Map;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> mp = new HashMap<>();
		mp.put("country", "India");
		
		mp.forEach((a,b) -> System.out.println(a + " "+ b) );
		
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> square = new ArrayList<>();

        nums.stream()
            .map(n -> n * n)           
            .forEach(square::add);      // Method reference to add squared values to square list

        // Print the square list to verify the squared values were added
 //       square.forEach(System.out::println);
        
        Stream.iterate(1, n -> n + 2)
        .limit(10)  // Limit the stream to 10 elements
        .forEach(System.out::println); 
        
	}

}
