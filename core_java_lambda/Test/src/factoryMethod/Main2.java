package factoryMethod;
abstract class Transport2 {
    public abstract void deliver();
}

class Truck2 extends Transport2 {
    @Override
    public void deliver() {
        System.out.println("Delivering by land in a truck.");
    }
}

class Ship2 extends Transport2 {
    @Override
    public void deliver() {
        System.out.println("Delivering by sea in a ship.");
    }
}

abstract class Logistics {
    // Factory method
    public abstract Transport2 createTransport();

    public void planDelivery() {
        Transport2 transport = createTransport();
        transport.deliver();
    }
}

class RoadLogistics extends Logistics {
    @Override
    public Transport2 createTransport() {
        return new Truck2();  // Factory method creating a Truck instance
    }
}

class SeaLogistics extends Logistics {
    @Override
    public Transport2 createTransport() {
        return new Ship2();  // Factory method creating a Ship instance
    }
}

public class Main2 {
    public static void main(String[] args) {
        Logistics logistics = new RoadLogistics();
        logistics.planDelivery();  // Output: Delivering by land in a truck.

        logistics = new SeaLogistics();
        logistics.planDelivery();  // Output: Delivering by sea in a ship.
    }
}
