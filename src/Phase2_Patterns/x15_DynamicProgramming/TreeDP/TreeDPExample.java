package Phase2_Patterns.x15_DynamicProgramming.TreeDP;

public class TreeDPExample {
    static class Node { int val; Node left, right; Node(int val){this.val = val;} }
    public static void main(String[] args) {
        Node root = new Node(-10);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);
        System.out.println("Max path sum: " + maxPathSum(root));
    }
    static int maxSum = Integer.MIN_VALUE;
    static int maxPathSum(Node node) {
        maxPath(node);
        return maxSum;
    }
    static int maxPath(Node node) {
        if (node == null) return 0;
        int left = Math.max(0, maxPath(node.left));
        int right = Math.max(0, maxPath(node.right));
        maxSum = Math.max(maxSum, left + right + node.val);
        return Math.max(left, right) + node.val;
    }
}
