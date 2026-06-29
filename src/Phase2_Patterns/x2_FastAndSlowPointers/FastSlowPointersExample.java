package Phase2_Patterns.x2_FastAndSlowPointers;

public class FastSlowPointersExample {
    public static void main(String[] args) {
        int[] nums = {1, 2, -1, -2, 2};
        System.out.println("Cycle detected: " + hasCycle(nums));
    }
    static boolean hasCycle(int[] nums) {
        int slow = 0, fast = 0;
        do {
            if (fast + 1 >= nums.length) return false;
            slow += nums[slow];
            fast += nums[fast];
            if (fast >= nums.length) return false;
            fast += nums[fast];
        } while (slow != fast);
        return true;
    }
}
