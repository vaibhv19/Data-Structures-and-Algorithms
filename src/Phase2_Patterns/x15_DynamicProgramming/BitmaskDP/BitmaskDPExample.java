package Phase2_Patterns.x15_DynamicProgramming.BitmaskDP;

import java.util.*;

public class BitmaskDPExample {
    public static void main(String[] args) {
        int[] values = {1, 2, 3};
        System.out.println("Subset sums: " + subsetSums(values));
    }

    static List<Integer> subsetSums(int[] values) {
        List<Integer> result = new ArrayList<>();
        int n = values.length;
        for (int mask = 0; mask < (1 << n); mask++) {
            int sum = 0;
            for (int i = 0; i < n; i++) if ((mask & (1 << i)) != 0) sum += values[i];
            result.add(sum);
        }
        return result;
    }
}
