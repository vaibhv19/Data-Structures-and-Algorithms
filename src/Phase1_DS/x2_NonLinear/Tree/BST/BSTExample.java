package Phase1_DS.x2_NonLinear.Tree.BST;

public class BSTExample {
    static class Node { int val; Node left, right; Node(int val) { this.val = val; } }

    public static void main(String[] args) {
        int[] values = {5, 3, 7, 2, 4, 6, 8};
        Node root = null;
        for (int v : values) root = insert(root, v);
        System.out.println("Search 4 found: " + search(root, 4));
        System.out.println("Search 10 found: " + search(root, 10));
    }

    static Node insert(Node node, int val) {
        if (node == null) return new Node(val);
        if (val < node.val) node.left = insert(node.left, val);
        else node.right = insert(node.right, val);
        return node;
    }

    static boolean search(Node node, int val) {
        if (node == null) return false;
        if (node.val == val) return true;
        return val < node.val ? search(node.left, val) : search(node.right, val);
    }
}
