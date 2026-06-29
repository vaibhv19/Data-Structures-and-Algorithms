package Phase2_Patterns.x14_GraphRouting.MST.Prim;

import java.util.*;

public class PrimExample {
    public static void main(String[] args) {
        int[][] graph = {
            {0, 1, 4},
            {1, 0, 2},
            {4, 2, 0}
        };
        System.out.println("Prim MST weight: " + primMST(graph));
    }

    static int primMST(int[][] graph) {
        int n = graph.length;
        boolean[] used = new boolean[n];
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0;
        int total = 0;
        for (int i = 0; i < n; i++) {
            int u = -1;
            for (int j = 0; j < n; j++) if (!used[j] && (u == -1 || dist[j] < dist[u])) u = j;
            used[u] = true;
            total += dist[u] == Integer.MAX_VALUE ? 0 : dist[u];
            for (int v = 0; v < n; v++) if (!used[v] && graph[u][v] != 0) dist[v] = Math.min(dist[v], graph[u][v]);
        }
        return total;
    }
}
