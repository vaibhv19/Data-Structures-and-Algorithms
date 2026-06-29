package Phase2_Patterns.x15_DynamicProgramming.IntervalDP;

import java.util.*;

public class IntervalDPExample {
    public static void main(String[] args) {
        int[][] intervals = {{1,3}, {2,4}, {3,5}};
        System.out.println("Maximum non-overlapping intervals: " + maxNonOverlapping(intervals));
    }
    static int maxNonOverlapping(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->a[1]-b[1]);
        int count = 0, end = Integer.MIN_VALUE;
        for (int[] interval : intervals) {
            if (interval[0] >= end) {
                count++; end = interval[1];
            }
        }
        return count;
    }
}
