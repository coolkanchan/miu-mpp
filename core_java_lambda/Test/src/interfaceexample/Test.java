package interfaceexample;

public class Test implements InterfaceA, InterfaceB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceA test = new Test();
		
		test.test();
//		test.show();
//		InterfaceB test2 = new Test();
//		test2.show();
		
//		System.out.println(test.hashCode());
//		System.out.print(test2.hashCode());

	}
	
//	public  void test() {
//		
//		System.out.println("hello Test");
//	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
		
		System.out.println("call - "  );
		
	}

	@Override
	public void show2() {
		// TODO Auto-generated method stub
		
	}


//	@Override
//	public void test() {
//		// TODO Auto-generated method stub
//		System.out.println("test call");
//		InterfaceA.super.test();
//	}

//	@Override
//	public void test() {
//		// TODO Auto-generated method stub
//		InterfaceB.super.test();
//	}

}
