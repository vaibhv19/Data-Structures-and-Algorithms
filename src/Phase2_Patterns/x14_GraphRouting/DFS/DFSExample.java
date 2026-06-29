package Phase2_Patterns.x14_GraphRouting.DFS;

import java.util.*;

public class DFSExample {
    public static void main(String[] args) {
        List<List<Integer>> adj = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(0, 3),
                Arrays.asList(0, 3),
                Arrays.asList(1, 2)
        );
        System.out.println("DFS order: " + dfs(adj, 0));
    }

    static List<Integer> dfs(List<List<Integer>> adj, int start) {
        boolean[] visited = new boolean[adj.size()];
        List<Integer> order = new ArrayList<>();
        dfsHelper(adj, start, visited, order);
        return order;
    }

    static void dfsHelper(List<List<Integer>> adj, int node, boolean[] visited, List<Integer> order) {
        visited[node] = true;
        order.add(node);
        for (int nei : adj.get(node)) {
            if (!visited[nei]) dfsHelper(adj, nei, visited, order);
        }
    }
}
