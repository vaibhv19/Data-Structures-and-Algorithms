package Phase2_Patterns.x14_GraphRouting.ShortestPath.FloydWarshall;

import java.util.Arrays;

public class FloydWarshallExample {
    public static void main(String[] args) {
        int INF = 1000000;
        int[][] dist = {
            {0, 3, INF},
            {INF, 0, 1},
            {2, INF, 0}
        };
        floydWarshall(dist);
        for (int[] row : dist) System.out.println(Arrays.toString(row));
    }
    static void floydWarshall(int[][] dist) {
        int n = dist.length;
        for (int k = 0; k < n; k++)
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
    }
}
