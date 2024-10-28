package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import comparator.EmployeeInfo1.SortMethod;

public class EmployeeInfo3 {

		static enum SortMethod {BYNAME, BYSALARY};
		
		
		Comparator<Employee3> sortByname = (e1, e2) -> {
			int nameCompare = e1.name.compareTo(e2.name);
			if(nameCompare !=0) {
				return nameCompare;
			}
			return Integer.compare(e1.salary, e2.salary);
			
		};
		
		Comparator<Employee3> sortBySalary = (e1, e2) -> {
			return Integer.compare(e1.salary, e2.salary);
			
			
		};
		
		
		public void sort(List<Employee3> emps, SortMethod method ) {
			
			if(method == SortMethod.BYNAME) {
				
				emps.sort(sortByname);
							
			}
			if(method == SortMethod.BYSALARY) {
				
				emps.sort(sortBySalary);
							
			}
			
		}
		
		
		public static void main(String[] args) {
			List<Employee3> emps = new ArrayList<>();
			emps.add(new Employee3("Joe", 100000));
			emps.add(new Employee3("Tim", 50000));
			emps.add(new Employee3("Andy", 60000));
			emps.add(new Employee3("Joe", 120000)); // Same name, different salary
			EmployeeInfo3 ei = new EmployeeInfo3();
			ei.sort(emps, EmployeeInfo3.SortMethod.BYNAME);
			System.out.println(emps);
			//same instance
			ei.sort(emps, EmployeeInfo3.SortMethod.BYSALARY);
			System.out.println(emps);
		}
	}
