package Phase1_DS.x2_NonLinear.Graph;

import java.util.*;

public class GraphExample {
    public static void main(String[] args) {
        int nodes = 5;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < nodes; i++) adj.add(new ArrayList<>());
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 2, 4);
        System.out.println("Adjacency list graph: " + adj);
    }

    static void addEdge(List<List<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
}
