package furniturechair;

public class Main {

	
	 public static void main(String[] args) {
	     // Create a Furniture object
	     Furniture furniture = new Furniture(100.0);
	     furniture.displayDetails(); 

	     // Create a Chair object
	     Chair chair = new Chair(150.0, 120);
	     chair.displayDetails(); 

	     chair.setPrice(200.0);
	     chair.setWeightCapacity(150);
	     chair.displayDetails(); 
	 }

}
