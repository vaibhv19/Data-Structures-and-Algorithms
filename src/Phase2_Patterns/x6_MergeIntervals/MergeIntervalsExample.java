package Phase2_Patterns.x6_MergeIntervals;

import java.util.*;

public class MergeIntervalsExample {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] merged = merge(intervals);
        System.out.println("Merged: " + Arrays.deepToString(merged));
    }
    static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->a[0]-b[0]);
        List<int[]> ans = new ArrayList<>();
        for (int[] interval : intervals) {
            if (ans.isEmpty() || ans.get(ans.size()-1)[1] < interval[0]) ans.add(interval);
            else ans.get(ans.size()-1)[1] = Math.max(ans.get(ans.size()-1)[1], interval[1]);
        }
        return ans.toArray(new int[0][]);
    }
}
