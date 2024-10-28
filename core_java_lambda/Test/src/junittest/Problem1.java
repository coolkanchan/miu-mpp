package junittest;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.*;

public class Problem1 {
	
	public static Predicate<Account> balanceGreaterThan50 = a-> a.getBalance()>50;
	
	public static Comparator<Customer> lastNameComperator = Comparator.comparing(Customer::getLastName);
	
	public static List<Customer> specialAccounts(List<Account> accounts) {	
		return accounts.stream().filter(balanceGreaterThan50)
				 .map(Account::getCustomer)
	             .sorted(lastNameComperator)
	             .collect(Collectors.toList());
				             
	}
		

	//A list of Customers whose checking account balance is > 50, sorted by customer's last name
//	public static List<Customer> specialAccounts(List<Account> accounts) {	
//		return accounts.stream().filter(a -> a.getBalance() > 50)
//				 .map((Account a) -> a.getCustomer())
//	             .sorted(Comparator.comparing((Customer c) -> c.getLastName()))
//	             .collect(Collectors.toList());
//				             
//	}
}
