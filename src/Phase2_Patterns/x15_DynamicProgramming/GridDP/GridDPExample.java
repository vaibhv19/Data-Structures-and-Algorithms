package Phase2_Patterns.x15_DynamicProgramming.GridDP;

public class GridDPExample {
    public static void main(String[] args) {
        int[][] grid = {{0,0,0},{0,1,0},{0,0,0}};
        System.out.println("Unique paths: " + uniquePathsWithObstacles(grid));
    }
    static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        dp[0][0] = obstacleGrid[0][0] == 1 ? 0 : 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (obstacleGrid[i][j] == 1) { dp[i][j] = 0; continue; }
                if (i > 0) dp[i][j] += dp[i-1][j];
                if (j > 0) dp[i][j] += dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}
