import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {

    public static Character firstNonRepeatingChar(String input) {
        Map<Character, Integer> countMap = new LinkedHashMap<>();

        // Count occurrences
        for (char c : input.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        // Find first non-repeating
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return null; // or throw exception or return '-' if no unique character
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeatingChar("apple"));     // Output: a
        System.out.println(firstNonRepeatingChar("racecars"));  // Output: e
        System.out.println(firstNonRepeatingChar("aabbcc"));    // Output: null
    }
}
