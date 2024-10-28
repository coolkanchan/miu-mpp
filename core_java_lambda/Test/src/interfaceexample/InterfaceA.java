package interfaceexample;


public interface InterfaceA {
	
	public void show();
	public void show2();
	
	default void test() {
		
		System.out.println("hello InterfaceA");
	}
	
	default void test2() {
		
		System.out.println("hello InterfaceA");
	}

}
