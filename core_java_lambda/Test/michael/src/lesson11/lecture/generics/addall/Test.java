package lesson11.lecture.generics.addall;
import java.util.*;
public class Test {
	public static void main(String[] args) {
		MyList<Employee> list = new MyListImpl<Employee>();
		Employee e = new Employee("Joe", 100000);
		list.add(e);
		Manager m = new Manager("John", 200000);
		list.add(m);
		MyList<Manager> list2 = new MyListImpl<Manager>();
		list2.add(m);
		list.addAll(list2); //compiler error
		
//		ArrayList<? extends Integer> list3 = new ArrayList<>();
//		list3.add(2);
		System.out.println("hello world");
		
		
		
		
		List<Number> nums = new ArrayList<Number>();
		List<Integer> ints = Arrays.asList(1, 2);
		List<Double> doubles = Arrays.asList(2.78, 3.14);
		nums.addAll(ints);
		nums.addAll(doubles);
		System.out .println(nums); //output: [1, 2, 2.78, 3.14]
		
		
		List<Integer> ints2 = new ArrayList<Integer>();
		ints2.add(1);
		ints2.add(2);
		List<? extends Number> nums2 = ints2;
		System.out .println("nums2 = "+nums2.toString()); 
	//	nums2.add(3.14); //compiler error
		System.out .println(ints2.toString()); //output: [1, 2, 3.14]
		nums2.add(null); //OK
		Number p =nums.get(0);
		
		
		List<? super Integer> test = new ArrayList<Number>();
		List<Number> num = new ArrayList<>();
		num.add(4.5);
		num.add(5.3);
		test = num;
		test.add(5);
		System.out .println(test);
//		Integer val1 = test.get(0); // compiler error
//		Number val2 = test.get(0); // compiler error
//		Comparable val3 = test.get(0); // compiler error
		Object val4 = test.get(0); // OK
		
		List<? super Integer> list21 = new ArrayList<Number>(); // List<? super Integer> can hold Integer or any of its supertypes

        // Adding an element of type Integer (T) is allowed
		list21.add(42);  // Works because Integer is T, and T is allowed
		
		 // Integer num = list.get(0);  // compile error
		

		
		
	}
}
