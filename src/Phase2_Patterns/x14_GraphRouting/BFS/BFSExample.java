package Phase2_Patterns.x14_GraphRouting.BFS;

import java.util.*;

public class BFSExample {
    public static void main(String[] args) {
        List<List<Integer>> adj = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(0, 3),
                Arrays.asList(0, 3),
                Arrays.asList(1, 2)
        );
        System.out.println("BFS order: " + bfs(adj, 0));
    }

    static List<Integer> bfs(List<List<Integer>> adj, int start) {
        boolean[] visited = new boolean[adj.size()];
        Queue<Integer> queue = new ArrayDeque<>();
        List<Integer> order = new ArrayList<>();
        visited[start] = true;
        queue.offer(start);
        while (!queue.isEmpty()) {
            int node = queue.poll();
            order.add(node);
            for (int nei : adj.get(node)) {
                if (!visited[nei]) {
                    visited[nei] = true;
                    queue.offer(nei);
                }
            }
        }
        return order;
    }
}
