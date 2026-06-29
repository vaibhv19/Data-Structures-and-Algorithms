package Phase2_Patterns.x1_TwoPointers;

public class TwoPointersExample {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int target = 6;
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                System.out.println("Found pair: " + nums[left] + ", " + nums[right]);
                break;
            }
            if (sum < target) left++;
            else right--;
        }
    }
}
