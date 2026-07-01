package Phase1_DS.x1_Linear.LinkedList;

import java.util.LinkedList;


public class CRUDwJCF {
    public static void main(String[] args) {
        // 1. CREATE: Instantiate an empty JCF Linked List container
        LinkedList<Integer> list = new LinkedList<>();

        System.out.println("--- Starting JCF Linked List Operations ---");

        // 2. UPDATE / INSERTION (Create operations)
        list.addFirst(10); // Inserts at the very front (Head)
        list.addFirst(5);  // List becomes: 5 -> 10

        list.addLast(20);  // Inserts at the very end (Tail)
        list.addLast(30);  // List becomes: 5 -> 10 -> 20 -> 30

        // 3. READ (Traversal operation)
        // JCF works seamlessly with standard loops or printing out directly
        System.out.println("Initial List State: " + list);
        // Expected Output: [5, 10, 20, 30]

        // 4. UPDATE / MODIFICATION (By Index)
        // Unlike our custom list, JCF allows direct access via internal index scanning
        list.set(2, 99); // Changes the value at index 2 (replaces 20 with 99)
        System.out.println("After update at index 2: " + list);
        // Expected Output: [5, 10, 99, 30]

        // 5. DELETE OPERATIONS
        list.removeFirst(); // Removes the head element (5)
        System.out.println("After removeFirst(): " + list);
        // Expected Output: [10, 99, 30]

        list.removeLast();  // Removes the tail element (30)
        System.out.println("After removeLast(): " + list);
        // Expected Output: [10, 99]

        // 6. READ / ACCESS (Peeking)
        System.out.println("First Element (Head): " + list.getFirst()); // Output: 10
        System.out.println("Last Element (Tail): " + list.getLast());   // Output: 99
    }
}