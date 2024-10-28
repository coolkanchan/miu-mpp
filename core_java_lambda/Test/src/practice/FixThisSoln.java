package practice;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FixThisSoln {
	
	List<String> processList(List<String> list) {
        return list.stream()
                .map(FunctionWithException.unchecked(x -> doNothingIfShort(x)))  // Handling exception
                .collect(Collectors.toList());
    }

    // This method throws a custom exception if the input string length > 3
    String doNothingIfShort(String input) throws InputTooLongException {
        if (input.length() > 3) throw new InputTooLongException();
        else return input;
    }

    public static void main(String[] args) {
    	FixThisSoln ft = new FixThisSoln();

        // First test case: no exception thrown
        List<String> words1 = Arrays.asList("not", "too", "big", "yet");
        System.out.println(ft.processList(words1));  // Output: [not, too, big, yet]

        // Second test case: "over" causes InputTooLongException
        List<String> words2 = Arrays.asList("not", "too", "big", "yet", "over");
        try {
            System.out.println(ft.processList(words2)); 
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getCause().getMessage());  
        }
    }

    // Custom exception class
    class InputTooLongException extends Exception {
        private static final long serialVersionUID = 1L;

        public InputTooLongException() {
            super("Must be length 3 or less");
        }

        public InputTooLongException(String s) {
            super(s);
        }

        public InputTooLongException(Throwable t) {
            super(t);
        }
    }

}
