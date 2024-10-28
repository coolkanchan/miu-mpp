package foreach;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.List;


public class ForEachExample<T> implements Consumer<T> {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");
		
		//print each element of the list in upper case format
		
		
//		list.forEach(p-> System.out.println(p.toUpperCase()));   //1
		
//		Consumer<String> c = new Consumer<String>() {   //2
//
//			@Override
//			public void accept(String t) {
//				System.out.println(t.toUpperCase());
//				
//			}		
//			
//		};
//		
//		list.forEach(c);
		
		list.forEach(new ForEachExample<>());
		
	}

	@Override
	public void accept(T t) {
		System.out.println(t.toString().toUpperCase());
		
	}
	
	//implement a Consumer
	
	
	
	
	
	
}