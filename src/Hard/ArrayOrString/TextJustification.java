package Hard.ArrayOrString;

import java.util.ArrayList;
import java.util.List;

public class TextJustification {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int index = 0;

        while (index < words.length) {
            // Determine how many words can fit in this line
            int totalChars = words[index].length();
            int last = index + 1;

            while (last < words.length) {
                if (totalChars + 1 + words[last].length() > maxWidth) break;
                totalChars += 1 + words[last].length();
                last++;
            }

            // Build the line
            StringBuilder sb = new StringBuilder();
            int numOfWords = last - index;
            int numOfSpaces = maxWidth - totalChars + (numOfWords - 1);

            // If this is the last line or only one word in this line, left-justify
            if (last == words.length || numOfWords == 1) {
                for (int i = index; i < last; i++) {
                    sb.append(words[i]);
                    if (i < last - 1) sb.append(" ");
                }

                // Fill the rest with spaces
                while (sb.length() < maxWidth) {
                    sb.append(" ");
                }
            } else {
                // Fully justify
                int spaces = (maxWidth - totalChars) / (numOfWords - 1);
                int extraSpaces = (maxWidth - totalChars) % (numOfWords - 1);

                for (int i = index; i < last - 1; i++) {
                    sb.append(words[i]);
                    sb.append(" "); // at least one space between words

                    // Add extra spaces if necessary
                    for (int j = 0; j < spaces + (i - index < extraSpaces ? 1 : 0); j++) {
                        sb.append(" ");
                    }
                }
                sb.append(words[last - 1]); // Append the last word in the line
            }

            result.add(sb.toString());
            index = last;
        }

        return result;
    }
}
