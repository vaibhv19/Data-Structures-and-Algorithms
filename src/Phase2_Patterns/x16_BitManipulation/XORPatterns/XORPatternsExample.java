package Phase2_Patterns.x16_BitManipulation.XORPatterns;

public class XORPatternsExample {
    public static void main(String[] args) {
        int[] nums = {2, 3, 2, 4, 4};
        System.out.println("Single number: " + singleNumber(nums));
    }
    static int singleNumber(int[] nums) {
        int x = 0;
        for (int num : nums) x ^= num;
        return x;
    }
}
