

public enum Constants {
	
	COMPANY(20000000,"Microsoft");
	
    private final double price;
    private final String name;
    
    
    Constants( double price, String name) {
    	
    	this.price= price;
    	this.name=name;
    	
    }
    
    public String getName() {
        return name;
    }

    // Getter method to retrieve the price
    public double getPrice() {
        return price;
    }
    
	public static void main(String[] args) {
		System.out.println(Constants.COMPANY.name);
		System.out.println(Constants.COMPANY.price);
//		System.out.println(Constants.SALES_TARGET);

	}

}
