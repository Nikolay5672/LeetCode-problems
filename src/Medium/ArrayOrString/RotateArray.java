package Medium.ArrayOrString;

public class RotateArray {
    public static void rotate(int[] nums, int k) {
        for(int i = 0; i < k; i++){
            for(int j = nums.length - 1; j > 0; j--){
                int temp = nums[j];
                nums[j] = nums[j - 1];
                nums[j - 1] = temp;
            }
        }
    }
    public static void rotateUpdated(int[] nums, int k) {
        k = k % nums.length;  // Handle cases where k is greater than the array length

        // Step 1: Reverse the entire array
        reverse(nums, 0, nums.length - 1);

        // Step 2: Reverse the first k elements
        reverse(nums, 0, k - 1);

        // Step 3: Reverse the remaining elements
        reverse(nums, k, nums.length - 1);

    }
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
