package functionalinterface;

public class MyFunctionalInterfaceImplementation  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		MyFunctionalInterfaceImplementation ob = new MyFunctionalInterfaceImplementation();
//		System.out.print(ob.myApply(10));
//
//	}

//	@Override
//	public Integer myApply(Integer a) {
//		// TODO Auto-generated method stub
//		return a*a;
//		
//	}
		
		MyFunctionalInterface ob = t-> t*100;
		
		System.out.println(ob.myApply(2));

}
}
