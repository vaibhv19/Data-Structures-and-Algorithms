package Phase2_Patterns.x8_MonotonicStack;

import java.util.*;

public class MonotonicStackExample {
    public static void main(String[] args) {
        int[] nums = {2,1,2,4,3};
        System.out.println("Next greater elements: " + Arrays.toString(nextGreaterElement(nums)));
    }
    static int[] nextGreaterElement(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums[i]) stack.pop();
            ans[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(nums[i]);
        }
        return ans;
    }
}
