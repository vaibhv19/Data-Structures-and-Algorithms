package Phase2_Patterns.x14_GraphRouting.MST.Kruskal;

import java.util.*;

public class KruskalExample {
    static class Edge implements Comparable<Edge> {
        int u, v, w;
        Edge(int u, int v, int w) { this.u = u; this.v = v; this.w = w; }
        public int compareTo(Edge other) { return this.w - other.w; }
    }

    public static void main(String[] args) {
        List<Edge> edges = Arrays.asList(new Edge(0,1,1), new Edge(1,2,2), new Edge(0,2,3));
        Collections.sort(edges);
        UnionFind uf = new UnionFind(3);
        int total = 0;
        for (Edge e : edges) {
            if (uf.find(e.u) != uf.find(e.v)) {
                uf.union(e.u, e.v);
                total += e.w;
            }
        }
        System.out.println("Kruskal MST weight: " + total);
    }

    static class UnionFind {
        int[] parent;
        UnionFind(int n) { parent = new int[n]; for (int i = 0; i < n; i++) parent[i] = i; }
        int find(int x) { return parent[x] == x ? x : (parent[x] = find(parent[x])); }
        void union(int a, int b) { parent[find(a)] = find(b); }
    }
}
