package Phase2_Patterns.x15_DynamicProgramming.LongestSubsequenceDP;

import java.util.*;

public class LongestSubsequenceDPExample {
    public static void main(String[] args) {
        int[] nums = {10, 9, 2, 5, 3, 7, 101};
        System.out.println("LIS length: " + lengthOfLIS(nums));
    }
    static int lengthOfLIS(int[] nums) {
        if (nums.length == 0) return 0;
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        int max = 1;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) dp[i] = Math.max(dp[i], dp[j] + 1);
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
