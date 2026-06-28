package Phase1_DS.x1_Linear.Stack;

public class CRUDwLL {

    // Custom Node structure
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head = null; // Points to the top of the stack

    // CREATE / UPDATE (PUSH) - Insert a new node at the head
    public void push(int data) {
        Node newNode = new Node(data);
        if (head != null) {
            newNode.next = head; // Link new node to the old top
        }
        head = newNode; // Move head to point to the new top
    }

    // DELETE (POP) - Remove the node at the head
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        int poppedData = head.data;
        head = head.next; // Shift the top pointer to the next node down
        return poppedData;
    }

    // READ (PEEK) - View the data at the head node
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return head.data;
    }

    // CHECK STATE
    public boolean isEmpty() {
        return head == null;
    }
}