package practice;

import java.util.stream.Stream;

public class PrimeStream {

    // Method to check if a number is prime
    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Method to generate an infinite stream of prime numbers
    private Stream<Integer> primes() {
        return Stream.iterate(2, n -> n + 1)
                     .filter(this::isPrime);  
    }

    // Method to print the first n primes
    public void printFirstNPrimes(long n) {
        primes()  
            .limit(n)  
            .forEach(System.out::println);  
    }

    public static void main(String[] args) {
        PrimeStream ps = new PrimeStream();
        ps.printFirstNPrimes(10);  // Print first 10 primes
        System.out.println("====");
        ps.printFirstNPrimes(5);   // Print first 5 primes
    }
}
