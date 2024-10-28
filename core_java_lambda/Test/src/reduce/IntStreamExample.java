package reduce;

import java.util.stream.IntStream;

public class IntStreamExample {

	
public static void main(String args[]) {
	
	// output 1, 4, 9, 16.
	
//	IntStream.iterate(1, n -> n +1).map(sqr -> sqr*sqr).limit(4).forEach(System.out::println);
	
	
	IntStream.iterate(1, n -> n +1).limit(4).forEach( sqr -> System.out.println(sqr * sqr) );
	
}
}
