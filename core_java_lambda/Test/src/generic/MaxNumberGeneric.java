package generic;

import java.util.Arrays;
import java.time.LocalTime;
import java.util.*;

public class MaxNumberGeneric {
	
	//public static <T extends Comparable<T>>   T findMaxNumber(List<T> ls) {  both are working
	
	public static <T extends Comparable<? super T>>   T findMaxNumber(List<T> ls) {
		
		T max =  ls.get(0);
		
		for(T p : ls) {
			
			if(p.compareTo(max) > 0) {
				max = p;
			}
		}
		
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> ls = Arrays.asList(10,20,4,34,56,2,3,6);
		
		System.out.println(findMaxNumber(ls));
		
List<String> lsString = Arrays.asList("apple", "banana", "mango", "lnar");
		
		System.out.println(findMaxNumber(lsString));

	}

}
