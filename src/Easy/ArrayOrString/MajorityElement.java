package Easy.ArrayOrString;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        // Count the frequency of each element
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Find the majority element
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > nums.length / 2) {
                return entry.getKey();  // Return the element (key), not the frequency
            }
        }

        return 0;
    }

}
