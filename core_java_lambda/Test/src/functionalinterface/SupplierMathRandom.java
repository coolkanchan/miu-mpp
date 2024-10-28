package functionalinterface;

import java.util.function.Supplier;

public class SupplierMathRandom {
	
	static class RandomSupplier implements Supplier<Double>{
		

		@Override
		public Double get() {
			return Math.random();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
/*		Supplier<Double> random = () -> Math.random();
		
		System.out.println("Random number: " +random.get());
		*/
		
		System.out.print("Random number: " + new RandomSupplier().get());

	}


}
