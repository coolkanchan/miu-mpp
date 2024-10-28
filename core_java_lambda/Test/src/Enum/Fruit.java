package Enum;

public enum Fruit {
	
	   APPLE("Apple", 1.2),
	    BANANA("Banana", 0.5),
	    ORANGE("Orange", 0.8);
	
	
    private final String name;
    private final double price;

    // Enum constructor to initialize the variables
  private Fruit(String name, double price) {
        this.name = name;
        this.price = price;
    }

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
	
	
	public static void main(String args [] ) {
		
		for(Fruit fruit : Fruit.values()) {
			
			System.out.println(fruit + "fruit name : "+ fruit.name + "price : "+ fruit.price);
			
			
		}
		
		System.out.println(Fruit.BANANA.name);
	}
	
}
