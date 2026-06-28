package Phase1_DS.x1_Linear.Stack;

import java.util.ArrayDeque;

public class CRUDwJCF {
    public static void main(String[] args) {
        // ----- CREATE -----
        // Using ArrayDeque as a high-performance Stack
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        // ----- UPDATE (PUSH) -----
        stack.push(10);
        stack.push(20);
        stack.push(30); // 30 is now on top

        // ----- READ (PEEK) -----
        // Look at the top element without removing it
        System.out.println("Top element: " + stack.peek()); // Output: 30

        // ----- DELETE (POP) -----
        // Remove and return the top element
        System.out.println("Removed: " + stack.pop()); // Output: 30
        System.out.println("New Top: " + stack.peek()); // Output: 20
    }
}