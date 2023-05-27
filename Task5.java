package project2;

import java.util.HashMap;
import java.util.Map;

public class Task5 {
    //Find the First Non-Repeating Character in a String: Given a string,
    //find and return the first non-repeating character. For example, in the
    //string "abracadabra", the first non-repeating character is 'c'.
    public static char findFirstNonRepeatingChar(String input) {

        Map<Character, Integer> charCounts = new HashMap<>();


        for (char c : input.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }


        for (char c : input.toCharArray()) {
            if (charCounts.get(c) == 1) {
                return c;
            }
        }


        return '\0';
    }

    public static void main(String[] args) {
        String input = "abracadabra";
        char firstNonRepeatingChar = findFirstNonRepeatingChar(input);
        System.out.println("First non-repeating character: " + firstNonRepeatingChar);
    }
}
