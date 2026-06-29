package Phase1_DS.x2_NonLinear.Tree.BinaryTree;

public class BinaryTreeExample {
    static class Node { int value; Node left, right; Node(int value) { this.value = value; } }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        System.out.print("Preorder traversal: ");
        preorder(root);
        System.out.println();
    }

    static void preorder(Node node) {
        if (node == null) return;
        System.out.print(node.value + " ");
        preorder(node.left);
        preorder(node.right);
    }
}
