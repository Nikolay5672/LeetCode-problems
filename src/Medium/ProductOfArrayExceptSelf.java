package Medium;

public class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        // Step 1: Compute prefix products
        int[] prefix = new int[n];
        prefix[0] = 1; // The product of elements to the left of index 0 is 1 (no elements)

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }

        // Step 2: Compute suffix products and combine with prefix products
        int suffix = 1; // The product of elements to the right of the last element is 1 (no elements)

        for (int i = n - 1; i >= 0; i--) {
            answer[i] = prefix[i] * suffix;
            suffix *= nums[i]; // Update suffix for the next iteration
        }

        return answer;
    }
}
