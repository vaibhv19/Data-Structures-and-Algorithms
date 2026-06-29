package Phase2_Patterns.x14_GraphRouting.TopologicalSort;

import java.util.*;

public class TopologicalSortExample {
    public static void main(String[] args) {
        List<List<Integer>> graph = Arrays.asList(
            Arrays.asList(1),
            Arrays.asList(2),
            Arrays.asList()
        );
        System.out.println("Topo order: " + topologicalSort(graph));
    }
    static List<Integer> topologicalSort(List<List<Integer>> graph) {
        int n = graph.size();
        int[] indegree = new int[n];
        for (int u = 0; u < n; u++) for (int v : graph.get(u)) indegree[v]++;
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < n; i++) if (indegree[i] == 0) queue.offer(i);
        List<Integer> order = new ArrayList<>();
        while (!queue.isEmpty()) {
            int u = queue.poll();
            order.add(u);
            for (int v : graph.get(u)) if (--indegree[v] == 0) queue.offer(v);
        }
        return order;
    }
}
