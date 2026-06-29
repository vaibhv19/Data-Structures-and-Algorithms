package Phase2_Patterns.x5_PrefixSum;

public class PrefixSumExample {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] prefix = buildPrefix(nums);
        System.out.println("Prefix sums: " + java.util.Arrays.toString(prefix));
        System.out.println("Sum 1..3: " + rangeSum(prefix, 1, 3));
    }
    static int[] buildPrefix(int[] nums) {
        int[] prefix = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) prefix[i+1] = prefix[i] + nums[i];
        return prefix;
    }
    static int rangeSum(int[] prefix, int left, int right) {
        return prefix[right+1] - prefix[left];
    }
}
