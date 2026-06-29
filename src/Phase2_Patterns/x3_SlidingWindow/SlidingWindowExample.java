package Phase2_Patterns.x3_SlidingWindow;

public class SlidingWindowExample {
    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 2, 3, 2};
        System.out.println("Max subarray sum of size 3: " + maxSumSubarray(nums, 3));
    }
    static int maxSumSubarray(int[] nums, int k) {
        int sum = 0, max = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (i >= k) sum -= nums[i-k];
            if (i >= k-1) max = Math.max(max, sum);
        }
        return max;
    }
}
