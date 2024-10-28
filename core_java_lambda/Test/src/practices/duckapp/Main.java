package practices.duckapp;

public class Main {

	    public static void main(String[] args) {
	        Duck[] ducks = {new MallardDuck(), new DecoyDuck(), new RedheadDuck(), new RubberDuck()};
	        for (Duck d: ducks) {
	            System.out.println(d.getClass().getSimpleName() + ":");
	            d.display();
	            // Check if the duck can fly
	            if (d instanceof FlyBehavior) {
	                ((FlyBehavior) d).fly();
	            }

	            // Check if the duck can quack
	            if (d instanceof QuackBehavior) {
	                ((QuackBehavior) d).quack();
	            }

	            d.swim();
	            System.out.println();
	        }
	    }
	}