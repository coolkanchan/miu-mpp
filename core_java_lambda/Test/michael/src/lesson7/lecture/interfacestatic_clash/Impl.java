package lesson7.lecture.interfacestatic_clash;

import java.util.Date;

public class Impl implements Sup1, Sup2 {
	
	public static void main(String[] args) {
		Sup1 s = new Impl();
		int val = Sup1.myMethod();
		System.out.println(val);
		
		Sup1 s2 = new Impl();
		int val2 = Sup1.myMethod();
		System.out.println(val2);
		
		System.out.println(s.equals(s2));
		
		System.out.println(s.hashCode());
		System.out.println(s2.hashCode());
		
		

	}
	
	public static int myMethod() {
		return 4;
	}
}
