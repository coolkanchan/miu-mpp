package practice;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Consumer;

import foreach.ForEachExample;

public class Test2<Integer> implements Consumer<Integer> {
    List<Integer> nums = (List<Integer>) Arrays.asList(1, 2, 3, 4, 5);
    private List<Integer> square = new ArrayList<>();
    public static void main(String[] args) {


//        Consumer<Integer> squareConsumer = n -> square.add(n * n);
//
//        nums.forEach(squareConsumer);
//
//        
//        
//        nums.forEach(new Consumer<Integer>() {
//			
//			@Override
//			public void accept(Integer t) {
//				square.add(t*t);
//			}	
//		});
    	
//        
//        square.forEach(System.out::println);
    	
    	Test2 ob = new Test2();
        
        ob.nums.forEach(ob);
        
        ob.square.forEach(System.out::println);
        
    }

	@Override
	public void accept(Integer t) {
		this.square.add(t );
		
	}
}
