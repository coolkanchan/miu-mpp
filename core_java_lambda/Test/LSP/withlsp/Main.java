package withlsp;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Bird flyingBird = new FlyingBird();
        ((FlyingBird) flyingBird).fly(); // FlyingBird can fly

        Bird ostrich = new Ostrich();
        // Ostrich does not fly, so calling fly() is not even an option

	}

}
