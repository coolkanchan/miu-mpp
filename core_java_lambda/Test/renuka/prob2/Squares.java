package lesson9.labsolns.prob4;

import java.util.stream.IntStream;


public class Squares {
	public static void main(String[] args) {	
		printSquares(4);
		printSquares(5);
	}
	
  	public static void printSquares(int num){

        Stream.iterate(1L, n -> n + 1).map(n -> n*n).limit(num).forEach(System.out::println);

    }

	
}
