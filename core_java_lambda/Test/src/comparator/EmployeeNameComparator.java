package comparator;

import java.util.Comparator;

/* A functor, but not a closure */
public class EmployeeNameComparator implements Comparator<Employee> {
	  public int compare(Employee e1, Employee e2) {
	        // First compare by name
	        int nameCompare = e1.name.compareTo(e2.name);
	        if (nameCompare != 0) {
	            return nameCompare;
	        }
	        // If names are equal, compare by salary
	        return Integer.compare(e1.salary, e2.salary);
	    }
}
