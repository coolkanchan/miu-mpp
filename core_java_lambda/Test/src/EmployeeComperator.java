
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class EmployeeComperator {
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	int salary;
	public EmployeeComperator(String n, int s) {
		this.name = n;
		this.salary = s;
	}
	@Override
	public String toString() {
		return "[" + name + ", " + salary+"]";
	}
	
	public static void main(String[] args) {
		List<EmployeeComperator> list = new ArrayList<EmployeeComperator>() {
			{
				add(new EmployeeComperator("Joe", 50000));
				add(new EmployeeComperator("Jim", 75000));
				add(new EmployeeComperator("Tom", 80000));
				add(new EmployeeComperator("Jim", 70000));
				add(new EmployeeComperator("Steve", 55000));
				add(new EmployeeComperator("Jim", 100000));
				add(new EmployeeComperator("Joe", 59000));
				add(new EmployeeComperator("Rich", 88000));
			}
		};
		
		List<EmployeeComperator> sortedList =list.stream()
				.sorted(Comparator.comparing(EmployeeComperator::getName)  // class reference
				.thenComparing(EmployeeComperator::getSalary, Comparator.reverseOrder()))			
				.collect(Collectors.toList());
		
        list.sort(Comparator
                .comparing((EmployeeComperator e) -> e.getName())  // Sort by name (descending)
                .thenComparing(e -> e.getSalary(), Comparator.reverseOrder()));     // Sort by salary (descending)

		//expected output:
		//[[Jim, 100000], [Jim, 75000], [Jim, 70000], [Joe, 59000], [Joe, 50000], [Rich, 88000], [Steve, 55000], [Tom, 80000]]
        
        System.out.println(list);

		System.out.println(sortedList);
	}
}

