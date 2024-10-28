package lesson8.lecture.lambdaexamples.comparator3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeInfo3 {
	static enum SortMethod {BYNAME, BYSALARY};
	public void sort(List<Employee3> emps,  SortMethod method) {	
		Collections.sort(emps, (e1,e2) ->
		{
			if(method == SortMethod.BYNAME) {
				return e1.name.compareTo(e2.name);
			} else {
				if(e1.salary == e2.salary) return 0;
				else if(e1.salary < e2.salary) return -1;
				else return 1;
			}
		});			
	}
	
	public static void main(String[] args) {
		List<Employee3> emps = new ArrayList<>();
		emps.add(new Employee3("Joe", 100000));
		emps.add(new Employee3("Tim", 50000));
		emps.add(new Employee3("Andy", 60000));
		EmployeeInfo3 ei = new EmployeeInfo3();
		ei.sort(emps, EmployeeInfo3.SortMethod.BYNAME);
		System.out.println(emps);
		//same instance
		ei.sort(emps, EmployeeInfo3.SortMethod.BYSALARY);
		System.out.println(emps);
	}
}
