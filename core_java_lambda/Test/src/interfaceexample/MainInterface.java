package interfaceexample;

public class MainInterface implements InterfaceDefaultA, InterfaceDefaultB{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterfaceDefaultA a = new MainInterface();
		a.show();
		
		InterfaceDefaultB b = new MainInterface();
		b.show();

	}

	@Override
	
	public void show() {   // we need to override otherwise compile error will show
		// TODO Auto-generated method stub
	//	InterfaceDefaultB.super.show();
		System.out.println("interfaceexample");
	}

}
