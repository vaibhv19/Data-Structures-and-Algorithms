package Phase2_Patterns.x14_GraphRouting.UnionFind;

public class UnionFindExample {
    public static void main(String[] args) {
        DSU dsu = new DSU(5);
        dsu.union(0, 1);
        dsu.union(1, 2);
        System.out.println("0 and 2 connected? " + (dsu.find(0) == dsu.find(2)));
        System.out.println("3 and 4 connected? " + (dsu.find(3) == dsu.find(4)));
    }

    static class DSU {
        int[] parent;
        DSU(int n) { parent = new int[n]; for (int i = 0; i < n; i++) parent[i] = i; }
        int find(int x) { return parent[x] == x ? x : (parent[x] = find(parent[x])); }
        void union(int a, int b) { parent[find(a)] = find(b); }
    }
}
