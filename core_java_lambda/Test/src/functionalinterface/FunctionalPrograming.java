package functionalinterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionalPrograming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> list =
				Arrays.asList("billy", "tommy", "rick", "abdul",
				"albert", "isaiah");
		
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println("Collections.sort = "+list);
		
		
		System.out.println("comparetor using stream = "+list.stream().sorted((a,b) -> a.compareTo(b)).collect(Collectors.toList()));
		
		System.out.println("comparetor using stream sort based on length = "
		+list.stream().sorted((a,b) -> b.length() - a.length()).collect(Collectors.toList()));
		
		System.out.println("comparetor using stream sort based on length reverse = "
				+list.stream().sorted(Comparator.comparing(String::length).reversed()).collect(Collectors.toList()));
		
		Function<String, Integer> lengthSize = x -> x.length();
		
		System.out.println("comparetor using stream sort based on length reverse = "
				+list.stream().sorted(Comparator.comparing(lengthSize).reversed()).collect(Collectors.toList()));
		
		
		
		list.sort((a,b) -> a.trim().compareTo(b.trim()));
		
		System.out.println("after sorting comperator = "+list);
		
		List<Integer> ls = Arrays.asList(1,4,6,3,2,66,8);
		Collections.sort(ls);
		System.out.println(ls);
		
		
		
	}

}
