package Phase2_Patterns.x16_BitManipulation.SubsetGeneration;

import java.util.*;

public class SubsetGenerationExample {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println("Subsets: " + subsets(nums));
    }
    static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        for (int mask = 0; mask < (1 << n); mask++) {
            List<Integer> subset = new ArrayList<>();
            for (int i = 0; i < n; i++) if ((mask & (1 << i)) != 0) subset.add(nums[i]);
            result.add(subset);
        }
        return result;
    }
}
