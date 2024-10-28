package practices.duckapp;

public class RubberDuck extends Duck implements QuackBehavior, FlyBehavior {
	
    @Override
    public void quack() {
        System.out.println("squeaking");
    }
    @Override
    public void display() {
        System.out.println("Displaying");
    }
    
    public void fly() {
        System.out.println("cannot fly");
    }

	
}
