package Phase1_DS.x1_Linear.LinkedList;

public class CRUD {
    Node head; // The global anchor tracking the front of the list

    // Inner Node Blueprint
    class Node {
        public int value;
        public Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    // CREATE: Insert at front
    public void addFirst(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // CREATE: Insert at back
    public void addLast(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // READ: Traversal Display Engine
    public void printlist() {
        // Base Case: Check if empty
        if (head == null) {
            System.out.println("list is empty");
            return; // Exit early!
        }

        // FIX: The loop lives OUTSIDE the empty check block
        Node currNode = head;
        while (currNode != null) { // FIX: Run until currNode itself is null to catch the last node
            System.out.print(currNode.value + " -> "); // FIX: Print .value instead of the raw node reference
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    public void deleteFirst() {
        // Edge Case: If the list is already empty, there is nothing to delete
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }

        // Move the head pointer one step forward to the next node
        head = head.next;
        System.out.println("Successfully deleted the first node.");
    }
    public void deleteLast() {
        // Edge Case 1: If the list is empty
        if (head == null) {
            System.out.println("List is empty. Cannot delete.");
            return;
        }

        // Edge Case 2: If there is ONLY ONE node in the list
        if (head.next == null) {
            head = null; // The list becomes completely empty
            System.out.println("Deleted the only remaining node. List is now empty.");
            return;
        }

        // Standard Case: Traverse to find the second-to-last node
        Node currNode = head;
        while (currNode.next.next != null) { // Look ahead two steps!
            currNode = currNode.next;
        }

        // Disconnect the last node by making the second-to-last node point to null
        currNode.next = null;
        System.out.println("Successfully deleted the last node.");
    }
    public static void main(String args[]) {
        CRUD list = new CRUD();

        list.addFirst(1); // List becomes: 1 -> null
        list.addFirst(2); // List becomes: 2 -> 1 -> null

        list.printlist(); // Will output: 2 -> 1 -> null
    }
} // Cleaned up the extra closing brace at the bottom