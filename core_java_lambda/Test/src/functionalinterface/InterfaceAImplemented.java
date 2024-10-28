package functionalinterface;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class InterfaceAImplemented {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterfaceA ob = (int a)-> a;
		
		System.out.println(ob.test(10));
		
		Predicate<Integer> p = t-> t>20;
		
		System.out.println(p.test(50));
		
//		ob.test();
		
		

	}

}
