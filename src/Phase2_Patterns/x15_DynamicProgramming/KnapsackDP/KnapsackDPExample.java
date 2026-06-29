package Phase2_Patterns.x15_DynamicProgramming.KnapsackDP;

public class KnapsackDPExample {
    public static void main(String[] args) {
        int[] weights = {1, 3, 4};
        int[] values = {15, 20, 30};
        int capacity = 4;
        System.out.println("Max value: " + knapsack(weights, values, capacity));
    }
    static int knapsack(int[] w, int[] v, int capacity) {
        int n = w.length;
        int[] dp = new int[capacity + 1];
        for (int i = 0; i < n; i++) {
            for (int j = capacity; j >= w[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - w[i]] + v[i]);
            }
        }
        return dp[capacity];
    }
}
