package functionalinterface;

import java.util.*;
import java.util.function.BiFunction;

public class BiFunctionExample1 {

	public static void main(String[] args) {
//		class MyBiFunction implements BiFunction<Integer, Integer, Integer> {
//			public Integer apply(Integer x, Integer y) {
//				return 2 * x.intValue() - y.intValue();
//			}
//		}
//		MyBiFunction f = new MyBiFunction();
//		System.out.println(f.apply(2, 3)); // output 1
		
		
		BiFunction<Integer, Integer, List> bf = (x, y) -> {
			List<Double> list = new ArrayList<>();
			list.add(Math.pow(x, y));
			list.add((double) (x*y));
			return list;
			
		};
		
		System.out.println(bf.apply(10, 5));
		
	}

}
