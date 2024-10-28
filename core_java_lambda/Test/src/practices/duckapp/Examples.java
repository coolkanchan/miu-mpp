package practices.duckapp;
import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.Function;
public class Examples {
	
	
	//type: Class::instanceMethod
	Function<String, String> upper1 = (String x) -> x.toUpperCase();
	Function<String, String> upper2 = String::toUpperCase;
	
	Function<Employee, String> name = (e -> e.getName());
	Function<Employee, String> referenceName = Employee::getName;
	
	BiFunction<String, String, Integer> compare = (String s1, String s2) -> s1.compareTo(s2);
	BiFunction<String, String, Integer> referenceCompare = String::compareTo;
	
	
	BiFunction<Integer, Integer, Double> mathpow = ( x, y) -> Math.pow(x, y);
	BiFunction<Integer, Integer, Double> methodMathpow =  Math::pow;
	Function<String, Integer> partseInt = (String x) -> Integer.parseInt(x);
	Function<String, Integer> referencePartseInt = Integer::parseInt;
	
	public Comparator<Employee> comp = new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			return o1.getName().compareTo(o2.getName());
		}
	};
	
	Comparator<Employee> f1 = (Employee e1, Employee e2) -> comp.compare(e1, e2);
	Comparator<Employee> f2 = comp::compare;
	
	
	public void evaluator() {
		System.out.println(upper2.apply("hello"));
		System.out.println(name.apply(new Employee("kanchan", 2345.3)));
		System.out.println(referenceName.apply(new Employee("kanchan", 2345.3)));
		System.out.println(compare.apply("ram", "ram"));
		System.out.println(referenceCompare.apply("ram", "saraswati"));
		System.out.println(mathpow.apply(10, 5));
		System.out.println(methodMathpow.apply(10, 5));
		System.out.println(partseInt.apply("20"));
		System.out.println(referencePartseInt.apply("202"));
		System.out.println(f1.compare(null, null));
		
	}
	
	public static void main(String[] args) {
		Examples e = new Examples();
		e.evaluator();
		
	}
	
}
