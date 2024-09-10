package Easy;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int k = 0; // pointer to track the position of non-val elements

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // move the non-val element to the k-th position
                k++; // increment the count of valid elements
            }
        }

        return k; // return the number of elements not equal to val

    }
}
