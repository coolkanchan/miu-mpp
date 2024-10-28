package generic;

import java.util.*;

public class GenericError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> ints = new ArrayList<>();
		ints.add(1);
		ints.add(2);
//		List<Number> nums = ints;   // error occurs here
//		nums.add(3.14);
		
		
		// reason In Java, generics are invariant, meaning that List<Integer>
		//is not a subtype of List<Number>, even though Integer is a subtype of Number.
		//Therefore, you cannot assign a List<Integer> to a List<Number>.
		
	/*	
		List<Number> ints = new ArrayList<>();
		ints.add(1);
		ints.add(2);
		List<Number> nums = ints;   // error occurs here
		nums.add(3.14);
	*/
		
		
		
/*		List<Integer> ints1 = new ArrayList<>();
		ints1.add(1);
		ints1.add(2);
		List<? extends Number> nums1 = ints1;
		nums1.add(3.14);   // This would not compile as you can't add elements to a wildcard list
		
		*/

	}
	

	
	


}
