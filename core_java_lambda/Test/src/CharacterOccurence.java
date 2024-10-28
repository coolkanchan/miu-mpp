import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class CharacterOccurence {

	public static Map duplicateCharacter(String str) {

		Map<Character, Integer> hm = new HashMap<>();

		for (char c : str.toCharArray()) {

			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1);

			} else {
				hm.put(c, 1);

			}
		}

		return hm;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// "String str = "geeksforgeeks"

		String str = "geeksforgeeks";

		Map<Character, Integer> duplicateCharacter = duplicateCharacter(str);
		
		duplicateCharacter.forEach((key, value) -> System.out.println(key + " "+ value ));

		for (Entry<Character, Integer> h : duplicateCharacter.entrySet()) {
			System.out.println(" key = "+ h.getKey() + "  duplicate occurent = "+ h.getValue());

		}
		
		String input = "JavaJavaEE";

        // convert string into stream
        Map < Character, Long > result = input
            .chars().mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        result.forEach((k, v) -> {
            if (v > 1) {
                System.out.println(k + " : " + v);
            }
        });

	}
}
