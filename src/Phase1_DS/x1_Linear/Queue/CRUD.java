package Phase1_DS.x1_Linear.Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class CRUD {
    public static void main(String[] args) {
        // ----- CREATE -----
        // Queue is an interface, so we instantiate it using ArrayDeque
        Queue<Integer> queue = new ArrayDeque<>();

        // ----- UPDATE (ENQUEUE) -----
        // Elements line up from front to back
        queue.add(10); // Front of the line
        queue.add(20);
        queue.add(30); // Back of the line

        // ----- READ (PEEK) -----
        // Check who is first in line
        System.out.println("First in line: " + queue.peek()); // Output: 10

        // ----- DELETE (DEQUEUE) -----
        // First-In, First-Out action
        System.out.println("Served and removed: " + queue.poll()); // Output: 10
        System.out.println("Next up in line: " + queue.peek());    // Output: 20
    }
}