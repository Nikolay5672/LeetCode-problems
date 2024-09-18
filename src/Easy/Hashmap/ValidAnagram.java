package Easy.Hashmap;

import java.util.HashMap;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (!map.containsKey(c)) {
                return false;  // t has a character that s doesn't have
            }
            map.put(c, map.get(c) - 1);
            if (map.get(c) < 0) {
                return false;  // t has more occurrences of a character than s
            }
        }

        return true;
    }

    public boolean isAnagramUpdated(String s, String t) {
        // If the lengths are different, the strings can't be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Create an array of size 26 for counting character frequencies
        int[] count = new int[26];

        // Traverse both strings simultaneously
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++; // Increment for s
            count[t.charAt(i) - 'a']--; // Decrement for t
        }

        // Check if all counts are zero
        for (int c : count) {
            if (c != 0) {
                return false;  // If any count is not zero, they are not anagrams
            }
        }

        return true;  // All counts are zero, so s and t are anagrams
    }
}
