public class StringToIntegerAtoi {
    public static int myAtoi(String s) {
        // Step 1: Ignore leading whitespaces
        s = s.trim();

        // Step 2: Check if the string is empty after trimming
        if (s.isEmpty()) {
            return 0;
        }

        // Step 3: Determine the sign
        int sign = 1;
        int startIndex = 0;
        if (s.charAt(0) == '-') {
            sign = -1;
            startIndex = 1;
        } else if (s.charAt(0) == '+') {
            startIndex = 1;
        }

        // Step 4: Convert characters to integer
        int result = 0;
        for (int i = startIndex; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!Character.isDigit(c)) {
                break;
            }
            // Handle potential overflow before multiplying by 10
            if (result > (Integer.MAX_VALUE - (c - '0')) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + (c - '0');
        }

        // Apply the sign
        result *= sign;

        return result;
    }
}
