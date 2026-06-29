package Phase1_DS.x3_JCF;

import java.util.*;

public class JCFExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Deque<Integer> deque = new ArrayDeque<>();
        Map<String, Integer> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        list.add("apple");
        list.add("banana");
        list.add("cherry");

        deque.addLast(10);
        deque.addLast(20);
        deque.addFirst(5);

        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        set.add("alpha");
        set.add("beta");
        set.add("gamma");

        maxHeap.offer(1);
        maxHeap.offer(5);
        maxHeap.offer(3);

        System.out.println("ArrayList: " + list);
        System.out.println("ArrayDeque: " + deque);
        System.out.println("HashMap: " + map);
        System.out.println("HashSet: " + set);
        System.out.println("Max Heap top: " + maxHeap.peek());
        System.out.println("Queue poll: " + deque.pollFirst());
        System.out.println("Map contains key 'two': " + map.containsKey("two"));
        System.out.println("Set contains 'delta': " + set.contains("delta"));
    }
}
