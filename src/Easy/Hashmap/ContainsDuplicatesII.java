package Easy.Hashmap;

import java.util.HashMap;

public class ContainsDuplicatesII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                // If the number exists in the map, check the index difference
                if (i - map.get(nums[i]) <= k) {
                    return true;
                }
            }
            // Update the index of the current number
            map.put(nums[i], i);
        }

        return false;
    }
}
