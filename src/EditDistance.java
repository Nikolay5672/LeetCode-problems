import java.util.HashMap;
import java.util.Map;

public class EditDistance {
    public static int minDistance(String word1, String word2) {

        int m = word1.length();
        int n = word2.length();

        // Create a DP array
        int[][] dp = new int[m + 1][n + 1];

        // Initialize the base cases
        for (int i = 0; i <= m; i++) {
            dp[i][0] = i; // All deletions
        }
        for (int j = 0; j <= n; j++) {
            dp[0][j] = j; // All insertions
        }

        // Fill the DP array
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1]; // Characters match, no extra cost
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j - 1], // Replace
                            Math.min(dp[i][j - 1], // Insert
                                    dp[i - 1][j])); // Delete
                    dp[i][j] += 1; // Add cost of operation
                }
            }
        }

        // The answer is in the bottom-right corner
        return dp[m][n];
    }
}
