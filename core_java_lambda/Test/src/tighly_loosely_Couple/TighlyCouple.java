package tighly_loosely_Couple;
class Engine {
    public void start() {
        System.out.println("Engine starts");
    }
}

class Car {
    private Engine engine;

    public Car() {
        // Car is tightly coupled with the Engine class
        engine = new Engine();
    }

    public void start() {
        engine.start();  // Car is responsible for creating and managing the Engine
    }
}

public class TighlyCouple {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
    }
}
