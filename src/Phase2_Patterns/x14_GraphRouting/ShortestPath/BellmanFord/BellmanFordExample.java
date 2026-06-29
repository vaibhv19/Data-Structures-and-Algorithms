package Phase2_Patterns.x14_GraphRouting.ShortestPath.BellmanFord;

import java.util.*;

public class BellmanFordExample {
    static class Edge { int u,v,w; Edge(int u,int v,int w){this.u=u;this.v=v;this.w=w;} }
    public static void main(String[] args) {
        int n = 4;
        List<Edge> edges = Arrays.asList(new Edge(0,1,1), new Edge(1,2,2), new Edge(2,3,3), new Edge(0,3,10));
        int[] dist = bellmanFord(n, edges, 0);
        System.out.println("Distances: " + Arrays.toString(dist));
    }
    static int[] bellmanFord(int n, List<Edge> edges, int source) {
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[source] = 0;
        for (int i = 0; i < n - 1; i++) {
            for (Edge e : edges) {
                if (dist[e.u] != Integer.MAX_VALUE && dist[e.u] + e.w < dist[e.v]) {
                    dist[e.v] = dist[e.u] + e.w;
                }
            }
        }
        return dist;
    }
}
