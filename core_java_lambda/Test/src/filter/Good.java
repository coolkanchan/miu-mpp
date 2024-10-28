package filter;

import java.util.List;
import java.util.stream.Collectors;

public class Good {
	public static void main(final String[] args) {
		Good good = new Good();
		
		System.out.println(String.format("Count word which contain 'N' and not contain 'e' with length of 4 "
				+ ": "+ good.findCountOfWord(Folks.friends, 'N', 'e', 4)));
		
		System.out.println(String.format("Count word which contain 't' and not contain 'z' with length of 5 "
				+ ": "+ good.findCountOfWord2(Folks.friends, 't', 'z', 5)));
		
	}
	
	public int findCountOfWord(List<String> list, char match, char notMatch, int length) {
		return 
		     (int) list.stream()   //convert list to stream
		     .filter(p -> p.length() == length)
		     .filter(p -> p.contains(""+match))
		     .filter(p -> !p.contains(""+notMatch))
		     .count();
	}
	
	
	public int findCountOfWord2(List<String> list, char match, char notMatch, int length) {
		return 
		     (int) list.stream()   //convert list to stream
		     .filter(p -> p.length() == length)
		     .filter(p -> p.contains(""+match))
		     .filter(p -> !p.contains(""+notMatch))
		     .collect(Collectors.toList()).size();
	}
	
	

}
