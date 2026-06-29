package Phase2_Patterns.x9_HashMapTracking;

import java.util.*;

public class HashMapTrackingExample {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3};
        System.out.println("Subarray sum equals 5 count: " + countSubarrays(nums, 5));
    }
    static int countSubarrays(int[] nums, int k) {
        Map<Integer, Integer> prefixCount = new HashMap<>();
        prefixCount.put(0,1);
        int sum = 0, count = 0;
        for (int num : nums) {
            sum += num;
            count += prefixCount.getOrDefault(sum - k, 0);
            prefixCount.put(sum, prefixCount.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
