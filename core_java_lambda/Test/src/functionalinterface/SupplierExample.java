package functionalinterface;

import java.util.function.Supplier;
import java.util.Random;

public class SupplierExample {
    public static void main(String[] args) {
        Random random = new Random();
        
        // Supplier to generate a random integer between 0 and 100
        Supplier<Integer> randomIntSupplier = () -> random.nextInt(100);
        
        // Generate and print 5 random integers
        for (int i = 0; i < 5; i++) {
            System.out.println("Random number: " + randomIntSupplier.get());
        }
           
        Supplier<String> stringSupplier = () -> "Hello, World!";
        
        // A Supplier that returns the current system time in milliseconds
        Supplier<Long> currentTimeSupplier = () -> System.currentTimeMillis();
        
        // Using the suppliers
        System.out.println("Supplied String: " + stringSupplier.get());
        System.out.println("Current Time (ms): " + currentTimeSupplier.get());
        
    }
}
