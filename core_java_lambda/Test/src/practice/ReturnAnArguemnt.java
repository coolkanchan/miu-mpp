package practice;

public class ReturnAnArguemnt {
    public static void main(String[] args) {
        // Implementing the functional interface using a lambda expression
    	MyIface numberGenerator = () -> 42;  
        
        // Using the method
        Integer result = numberGenerator.produce();
        System.out.println("Generated number: " + result);
    }
}
