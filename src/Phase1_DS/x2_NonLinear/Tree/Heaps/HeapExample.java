package Phase1_DS.x2_NonLinear.Tree.Heaps;

import java.util.PriorityQueue;

public class HeapExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.offer(5);
        minHeap.offer(1);
        minHeap.offer(3);
        System.out.print("Heap order: ");
        while (!minHeap.isEmpty()) System.out.print(minHeap.poll() + " ");
        System.out.println();
    }
}
