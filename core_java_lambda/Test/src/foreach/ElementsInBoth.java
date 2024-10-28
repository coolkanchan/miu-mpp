package foreach;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;

public class ElementsInBoth {
	
	
	static List<String> matchLsit = new ArrayList<>();
	
	static List<String> elementsInBoth(List<String> list1, List<String> list2){
		
		
	//	return list1.stream().filter(list2::contains).collect(Collectors.toList());  // approach 1
		
		list1.forEach(s -> {            // approach 2
			if(list2.contains(s)) {
				matchLsit.add(s);	
			}		
		});
		return matchLsit;
	}
	
	
	static List<String> getZipsOfSpecialCustomers(List<Customer> cus){
		
		return 	cus.stream()
				.filter(c -> c.getCity().length()>=6)
				.filter(c -> !c.getCity().toLowerCase().contains(""+'e'))
				.map(e -> e.getZip()).distinct().sorted().collect(Collectors.toList());
	}
	

	public static void main(String[] args) {

		List<String> ls1 = Arrays.asList("A", "B", "D");
		
		List<String> ls2 = Arrays.asList("B", "C", "D");		
		
		matchLsit = ElementsInBoth.elementsInBoth(ls1, ls2);	
		matchLsit.forEach(System.out::println);	
		
		
		// 2nd problem
		List<Customer> emp = new ArrayList<>();
		emp.add(new Customer("Bob", "11 Adams", "Fairfield", "52556"));
		emp.add(new Customer("Andy", "1000 Channing Ave", "Oskaloosa", "54672"));
		emp.add(new Customer("Zeke", "212 Wilkshire Blvd", "Chicago", "57532"));
		emp.add(new Customer("Tom", "211 Blake Ave", "Oskaloosa", "54672" ));
		emp.add(new Customer("Bill", "10 Wolfsen Blvd", "Orkin", "84447" ));
		
		System.out.println(getZipsOfSpecialCustomers(emp));
		

		
		
		
		
	}

}
