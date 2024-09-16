package Medium.ArrayOrString;

public class ZigZagConversion {
    public static String convert(String s, int numRows) {
        // Edge case: if number of rows is 1, no zigzagging is needed
        if (numRows == 1) {
            return s;
        }

        // Create a StringBuilder array to hold the characters for each row
        StringBuilder[] rows = new StringBuilder[Math.min(numRows, s.length())];
        for (int i = 0; i < rows.length; i++) {
            rows[i] = new StringBuilder();
        }

        // Traverse the string and place characters in the appropriate row
        int curRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            rows[curRow].append(c);

            // If we are at the top or bottom row, change direction
            if (curRow == 0 || curRow == numRows - 1) {
                goingDown = !goingDown;
            }

            // Move to the next row depending on the direction
            curRow += goingDown ? 1 : -1;
        }

        // Combine all rows to form the final zigzagged string
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}
