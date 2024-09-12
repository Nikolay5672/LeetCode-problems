package Easy.TwoPointers;

import java.lang.reflect.Array;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int start = 0;  // Pointer to track characters in s

        // Traverse through the string t
        for (int i = 0; i < t.length(); i++) {
            if (start < s.length() && s.charAt(start) == t.charAt(i)) {
                start++;  // Move to the next character in s
            }
            // Early exit: If we've matched all characters of s, no need to continue
            if (start == s.length()) {
                return true;
            }
        }

        // Check if we've matched all characters of s
        return start == s.length();
    }
}
