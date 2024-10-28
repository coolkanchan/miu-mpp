package practices.duckapp;

public class DecoyDuck extends Duck implements QuackBehavior, FlyBehavior {
	
	  @Override
	    public void quack() {
	        System.out.println("cannot quack");
	    }
	  
    @Override
    public void display() {
        System.out.println("Displaying");
    }
    
    public void fly() {
        System.out.println("cannot fly");
    }

}
