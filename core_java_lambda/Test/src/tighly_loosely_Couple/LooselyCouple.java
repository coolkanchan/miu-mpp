package tighly_loosely_Couple;
// Interface to decouple the Car from specific engine implementations
interface Engine2 {
    void start2();
}

// Two different implementations of Engine
class GasEngine2 implements Engine2 {
    @Override
    public void start2() {
        System.out.println("Gas engine starts");
    }
}

class ElectricEngine2 implements Engine2 {
    @Override
    public void start2() {
        System.out.println("Electric engine starts");
    }
}

class Car2 {
    private Engine2 engine;

    // Engine is now injected through constructor
    public Car2(Engine2 engine) {
        this.engine = engine;
    }

    public void start2() {
        engine.start2();  // Car depends on the Engine interface, not a specific implementation
    }
}

public class LooselyCouple {
    public static void main(String[] args) {
        Engine2 gasEngine = new GasEngine2();
        Engine2 electricEngine = new ElectricEngine2();

        // Injecting different engines into Car (Loose Coupling)
        Car2 gasCar = new Car2(gasEngine);
        Car2 electricCar = new Car2(electricEngine);

        gasCar.start2();  // Output: Gas engine starts
        electricCar.start2();  // Output: Electric engine starts
    }
}
