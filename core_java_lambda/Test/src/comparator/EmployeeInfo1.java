package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeInfo1 {
	static enum SortMethod {BYNAME, BYSALARY};
	
	public void sort(List<Employee1> emps, final SortMethod method) {
		class EmployeeComparator implements Comparator<Employee1> {
            @Override
            public int compare(Employee1 e1, Employee1 e2) {
                if (method == SortMethod.BYNAME) {
                    // First compare by name
                    int nameCompare = e1.name.compareTo(e2.name);
                    if (nameCompare != 0) {
                        return nameCompare;
                    }
                    // If names are equal, compare by salary
                    return Integer.compare(e1.salary, e2.salary);
                } else {
                    // Sort by salary
                    return Integer.compare(e1.salary, e2.salary);
                }
            }
        }
		Collections.sort(emps, new EmployeeComparator());
	}
	
	public static void main(String[] args) {
		List<Employee1> emps = new ArrayList<>();
		emps.add(new Employee1("Joe", 100000));
		emps.add(new Employee1("Tim", 50000));
		emps.add(new Employee1("Andy", 60000));
		emps.add(new Employee1("Joe", 120000)); // Same name, different salary
		EmployeeInfo1 ei = new EmployeeInfo1();
		ei.sort(emps, EmployeeInfo1.SortMethod.BYNAME);
		System.out.println(emps);
		//same instance
		ei.sort(emps, EmployeeInfo1.SortMethod.BYSALARY);
		System.out.println(emps);
	}
}
