package Easy.ArrayOrString;

public class MergeSortedArrays {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // Start filling nums1 from the last index.
        int lastIndex = m + n - 1;

        // Pointers for nums1 and nums2.
        int i = m - 1;  // Pointer for the last element in nums1's valid part.
        int j = n - 1;  // Pointer for the last element in nums2.

        // Merge nums2 into nums1, starting from the back.
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[lastIndex] = nums1[i];
                i--;
            } else {
                nums1[lastIndex] = nums2[j];
                j--;
            }
            lastIndex--;
        }

        // If nums2 still has elements left, copy them.
        while (j >= 0) {
            nums1[lastIndex] = nums2[j];
            j--;
            lastIndex--;
        }

        // If nums1 has elements left, they're already in place.
    }
}
