package Easy.Intervals;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums.length == 0) {
            return result;
        }

        int left = nums[0];

        for (int i = 0; i < nums.length; i++) {
            // If it's the last element or the next element is not consecutive
            if (i == nums.length - 1 || nums[i] + 1 != nums[i + 1]) {
                if (left == nums[i]) {
                    // Single element range
                    result.add(String.valueOf(left));
                } else {
                    // Range with more than one element
                    result.add(left + "->" + nums[i]);
                }
                // Update the left boundary for the next range
                if (i != nums.length - 1) {
                    left = nums[i + 1];
                }
            }
        }

        return result;
    }
}
