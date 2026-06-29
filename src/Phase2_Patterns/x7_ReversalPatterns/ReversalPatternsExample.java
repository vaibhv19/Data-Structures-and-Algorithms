package Phase2_Patterns.x7_ReversalPatterns;

import java.util.*;

public class ReversalPatternsExample {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        reverse(arr);
        System.out.println("Reversed: " + Arrays.toString(arr));
    }
    static void reverse(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left]; arr[left] = arr[right]; arr[right] = temp;
            left++; right--;
        }
    }
}
