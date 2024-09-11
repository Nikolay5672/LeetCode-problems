package Medium;

import java.util.List;

public class ReverseWordsInAString {
    public static String reverseWords(String s) {
        // Trim the string to remove leading and trailing spaces
        s = s.trim();

        // Split by spaces and filter out empty strings caused by multiple spaces
        String[] words = s.split("\\s+");

        // Use StringBuilder to efficiently reverse and join the words
        StringBuilder reversed = new StringBuilder();

        // Loop through the words array in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" ");  // Add a space between words, but not after the last word
            }
        }

        return reversed.toString();
    }
}

