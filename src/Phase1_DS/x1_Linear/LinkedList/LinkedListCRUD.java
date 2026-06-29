package Phase1_DS.x1_Linear.LinkedList;

public class LinkedListCRUD {
    static class Node { int value; Node next; Node(int value) { this.value = value; } }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        System.out.print("List after creation: ");
        printList(head);
        head = insertAt(head, 2, 99);
        System.out.print("After insert 99 at index 2: ");
        printList(head);
        head = deleteAt(head, 1);
        System.out.print("After delete index 1: ");
        printList(head);
    }

    static Node insertAt(Node head, int index, int value) {
        Node dummy = new Node(0);
        dummy.next = head;
        Node cur = dummy;
        for (int i = 0; i < index && cur.next != null; i++) cur = cur.next;
        Node node = new Node(value);
        node.next = cur.next;
        cur.next = node;
        return dummy.next;
    }

    static Node deleteAt(Node head, int index) {
        Node dummy = new Node(0);
        dummy.next = head;
        Node cur = dummy;
        for (int i = 0; i < index && cur.next != null; i++) cur = cur.next;
        if (cur.next != null) cur.next = cur.next.next;
        return dummy.next;
    }

    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.value + " ");
            head = head.next;
        }
        System.out.println();
    }
}
