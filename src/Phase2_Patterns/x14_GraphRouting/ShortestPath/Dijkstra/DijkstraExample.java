package Phase2_Patterns.x14_GraphRouting.ShortestPath.Dijkstra;

import java.util.*;

public class DijkstraExample {
    static class Edge { int node, cost; Edge(int node,int cost){this.node=node;this.cost=cost;} }
    public static void main(String[] args) {
        List<List<Edge>> graph = new ArrayList<>();
        for (int i = 0; i < 3; i++) graph.add(new ArrayList<>());
        graph.get(0).add(new Edge(1, 4));
        graph.get(0).add(new Edge(2, 2));
        System.out.println("Distances: " + Arrays.toString(dijkstra(graph, 0)));
    }
    static int[] dijkstra(List<List<Edge>> graph, int source) {
        int n = graph.size();
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[source] = 0;
        PriorityQueue<Edge> pq = new PriorityQueue<>(Comparator.comparingInt(e -> e.cost));
        pq.offer(new Edge(source, 0));
        while (!pq.isEmpty()) {
            Edge top = pq.poll();
            if (top.cost > dist[top.node]) continue;
            for (Edge edge : graph.get(top.node)) {
                int nd = top.cost + edge.cost;
                if (nd < dist[edge.node]) {
                    dist[edge.node] = nd;
                    pq.offer(new Edge(edge.node, nd));
                }
            }
        }
        return dist;
    }
}
