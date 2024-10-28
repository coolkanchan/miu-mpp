package interfaceexample;

public interface InterfaceDefaultC extends InterfaceDefaultA,InterfaceDefaultB{

	 @Override
	 default void show() {   // if two interface have same method with signature then we need to override
		// TODO Auto-generated method stub
	//	InterfaceDefaultA.super.show();
	}

}
