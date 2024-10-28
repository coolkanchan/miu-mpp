package Enum;

public enum SingletonEnum {
	
	INSTANCE;
	
	public void getData(){
		
		System.out.print("Hello world");
		
	}
	
	public static void main(String args[]) {
		SingletonEnum.INSTANCE.getData();
		
	}

}
