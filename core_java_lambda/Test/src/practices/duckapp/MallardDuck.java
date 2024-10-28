package practices.duckapp;

public class MallardDuck extends Duck implements FlyBehavior, QuackBehavior {
	
	
    @Override
    public void display() {
        System.out.println("Displaying");
    }

}
