package generic;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

public class LambdaLibrary {
	
//	public static double sum(Collection<? extends Number> nums {
//	    double s = 0.0;
//	    for(Number num : nums) s += num.doubleValue();
//	    return s;
//	}
	
	
	
	
	
	
	
	

	public static final Function<Integer, List<Long>> PROB1 = 
            (amount) -> Stream.generate(Math::random)
            .limit(amount)
            .map(x -> Math.round(x * 100))
            .collect(Collectors.toList());
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(PROB1.apply(5));
		
		
//		List<Integer> ints = new ArrayList<>();
//		ints.add(1);
//		ints.add(2);
//		List<? extends Number> nums = ints;
//		double dbl = sum(nums);
//		nums.add(3.14);
		
		
//		List<Object> objs = new ArrayList<>();
//		objs.add(1);
//		objs.add("two");
//		List<? super Integer> ints = objs;
//		ints.add(3);
//		double dbl = sum(ints);

	}

}
