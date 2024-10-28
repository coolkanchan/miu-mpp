package filter;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.*;

public class StreamAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> words = Arrays.asList("hello", "I", "good", "what about you");
		
		int count = 0;
		for(String word : words) {
		if(word.length() >=5)
		count++;
		}
		
		System.out.println(count);
		
		
		System.out.println(words.stream().count());
		
		System.out.println(words.stream().filter(p -> p.length() >5).count());
		
		
		List<String> uppwords =words.stream().filter( p-> p.length()>4).limit(2).map(s -> {
			
			System.out.println("kanchan = "+s.toUpperCase());
			return s.toUpperCase();
			
		
		}).collect(Collectors.toList());
		
System.out.println(uppwords);

	}

}
