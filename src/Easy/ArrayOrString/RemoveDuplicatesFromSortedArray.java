package Easy.ArrayOrString;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        // If the array is empty, return 0
        if (nums.length == 0) {
            return 0;
        }

        // Pointer `k` to keep track of the position of the unique elements
        int k = 1;  // Start from the second element since the first one is always unique

        // Iterate through the array from the second element onwards
        for (int i = 1; i < nums.length; i++) {
            // If the current element is different from the previous one
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];  // Move the unique element to position `k`
                k++;  // Increment the count of unique elements
            }
        }

        return k;  // `k` is the number of unique elements

    }
}



// 1 1 2 3 4 4 4 - 1 2 3 4