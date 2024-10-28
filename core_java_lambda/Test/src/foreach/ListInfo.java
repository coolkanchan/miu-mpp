package foreach;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;


public class ListInfo {
	List<String> list = new ArrayList<>();
	MyStringList strList = new MyStringList();
	public static void main(String[] args) {
		ListInfo li = new ListInfo();
		li.process();
		
	}
	
	public void process() {
		list.add("A");
		list.add("W");
		list.add("K");
		list.add("C");
		
		Consumer<String> c = new Consumer<String>() {
			
			
			@Override
			public void accept(String t) {
				strList.add(t);
			}						
		};
		
		list.forEach(c);
		strList.forEach(p -> System.out.print(p));
		strList.forEach(System.out::println);
		//use java8 foreach to copy all list elements into strList
		
		strList.forEach(new Consumer<String>() {
			
			@Override
			public void accept(String t) {
				System.out.print(t);
			}	
		});
		
		
	}
	
	
	
}
