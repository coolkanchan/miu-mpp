package optional;

import java.util.Optional;

public class MySingletonLazy {
    private static MySingletonLazy instance = null;
    private MySingletonLazy() {}
    public static MySingletonLazy getInstance() {
    	
    	instance = Optional.ofNullable(instance).orElseGet(MySingletonLazy::new);

        return instance;
    }
    
    public static void main(String args[]) {
    	
    	 MySingletonLazy mySingletonLazy = MySingletonLazy.getInstance();
    	 MySingletonLazy mySingletonLazy2 = MySingletonLazy.getInstance();
    	 
    	 System.out.println(mySingletonLazy.hashCode());
    	 System.out.println(mySingletonLazy2.hashCode());
    			 
    }

}
