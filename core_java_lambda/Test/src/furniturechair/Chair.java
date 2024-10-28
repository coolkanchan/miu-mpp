package furniturechair;

class Chair extends Furniture {
	 private int weightCapacity; 

	 public Chair(double price, int weightCapacity) {
	     super(price); // Call to the superclass constructor to set the price
	     this.weightCapacity = weightCapacity;
	 }

	 public int getWeightCapacity() {
	     return weightCapacity;
	 }

	 public void setWeightCapacity(int weightCapacity) {
	     this.weightCapacity = weightCapacity;
	 }

	 @Override
	 public void displayDetails() {
	     super.displayDetails(); 
	     System.out.println("Chair weight capacity: " + weightCapacity + " kg");
	 }
}