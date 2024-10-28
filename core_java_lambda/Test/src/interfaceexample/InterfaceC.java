package interfaceexample;

public interface InterfaceC extends InterfaceA, InterfaceB{
	
	public void show();
	
	default void test() {
		
		System.out.println("hello InterfaceC");
	}


}
