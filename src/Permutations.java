import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int[] nums, List<Integer> current, List<List<Integer>> result) {
        // Base case: if the current permutation is the same size as the input array
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int num : nums) {
            // Skip the number if it is already in the current permutation
            if (current.contains(num)) continue;

            // Add the number to the current permutation
            current.add(num);

            // Recurse with the current number included
            backtrack(nums, current, result);

            // Remove the last added number to backtrack
            current.removeLast();
        }
    }
}
