# My personal 2-Phase DSA plan
### A Structured, Pattern-Based Curriculum for Java Developers

---

## 📌 Phase 1: Data Structures Foundation (The Tools)
**Goal:** Master structural layout, memory allocation, and basic data manipulation. Do not solve complex LeetCode problems yet. Focus strictly on CRUD (Create, Read, Update, Delete) operations.

### 1. Linear Data Structures (Dynamic Arrays & Linear Memory)
- [ ] **Arrays & Strings:** Master basic index-based access, sequential iteration, and Java-native methods (`.length()`, `.charAt()`, `.substring()`).
- [ ] **Stacks & Queues:** Master the principle of LIFO (Last In, First Out) and FIFO (First In, First Out).
    * *Java Implementation Note:* Avoid the legacy `Stack` class; use `ArrayDeque<>()` for both stacks and queues.
- [ ] **Linked Lists (Singly & Doubly):** Learn structural pointer linking. You must be able to write code from scratch to insert, delete, and traverse nodes without losing references in memory.

### 2. Non-Linear Data Structures (Hierarchical & Network Memory)
- [ ] **Hash Maps & Sets:** Understand the mechanics of hashing. Master storing and retrieving Key-Value pairs in constant O(1) time.
- [ ] **Trees (Binary Search Trees):** Understand root nodes, leaf nodes, left/right child allocations, and basic node insertion and lookup constraints.
- [ ] **Graphs:** Understand real-world entity routing (Nodes and Edges). Master representing graphs using an Adjacency List (`ArrayList<ArrayList<Integer>>` or `HashMap<Integer, List<Integer>>`).

### 3. Java Collections Framework (JCF) 
- [ ] **Industrial Tooling:** Master the concrete implementations within the `java.util` package. Focus on utilizing `ArrayList` for dynamic array mutations, `ArrayDeque` to model performance-optimal Stacks and Queues, `HashMap`/`HashSet` for predictive key indexing, and `PriorityQueue` combined with lambda sorting comparators (e.g., `(a, b) -> b - a`) for building custom heaps.

---

## 📌 Phase 2: Algorithmic Problem-Solving (The Patterns)
**Goal:** Transition from data containers to logical patterns. Use these core patterns to approach your daily LeetCode questions systematically.

### Phase 2 Pattern Matrix

| Pattern Category | Core Concept / Use Case | Time Complexity Target | Essential Sample Problems |
| :--- | :--- | :--- | :--- |
| **1. Two Pointers** | Iterating from both ends or distinct positions of a sorted array/list to find a pair or rearrange elements. | O(n) | • Two Sum II<br>• 3Sum<br>• Sort Colors |
| **2. Fast & Slow Pointers** | Two pointers moving at different speeds to detect loops, structural midpoints, or cycles. | O(n) | • Linked List Cycle<br>• Find the Duplicate Number<br>• Palindrome Linked List |
| **3. Sliding Window** | Expanding/shrinking a contiguous sub-segment (subarray/substring) to evaluate window criteria. | O(n) | • Max Sum Subarray of Size K<br>• Longest Substring Without Repeating Chars<br>• Minimum Window Substring |
| **4. Kadane's Pattern** | Single-pass iterative tracking to compute maximum or minimum contiguous global sums. | O(n) | • Maximum Subarray<br>• Maximum Product Subarray<br>• Maximum Absolute Sum |
| **5. Prefix Sum** | Pre-calculating cumulative arrays to answer coordinate interval or subarray sum queries instantly. | O(n) time, O(n) space | • Subarray Sum Equals K<br>• Find Pivot Index<br>• Contiguous Array |
| **6. Merge Intervals** | Sorting and resolving overlapping ranges, schedules, or coordinate time-slots. | O(n log n) | • Merge Intervals<br>• Insert Interval<br>• Minimum Meeting Rooms |
| **7. In-Place Reversal (LL)** | Re-linking node connections sequentially without allocating auxiliary memory objects. | O(n) time, O(1) space | • Reverse Linked List<br>• Reverse Linked List II<br>• Reverse Nodes in k-Group |
| **8. Monotonic Stack** | Maintaining a strictly increasing/decreasing stack structure to find nearest immediate maxima/minima. | O(n) | • Next Greater Element<br>• Daily Temperatures<br>• Remove K Digits |
| **9. Hash Map Tracking** | Using key-value maps as an instantaneous digital look-back memory bank during a single linear pass. | O(n) time, O(n) space | • First Unique Character<br>• Ransom Note<br>• Subarray Sum Equals K |
| **10. Binary Search (Modified)** | Dividing search horizons logarithmically (O(log n)); applied to rotated arrays and "Search Space of Answers." | O(log n) | • Search in Rotated Sorted Array<br>• Koko Eating Bananas<br>• Book Allocation Problem |
| **11. Heaps / Top 'K'** | Utilizing Min-Heaps/Max-Heaps to dynamically track high-frequency or minimum priority elements. | O(n log k) | • Kth Largest Element<br>• Top K Frequent Elements<br>• Find Median from Data Stream |
| **12. Recursion & Backtracking** | Systematically generating and exploring all branch pathways, with an immediate "undo" state reversal step. | Exponential | • Permutations<br>• Combination Sum<br>• Generate Parentheses |
| **13. Tree Traversals** | Utilizing specialized depth strategies (DFS) or level-by-level queuing (BFS) on structural layouts. | O(n) | • Binary Tree Level Order Traversal<br>• Lowest Common Ancestor<br>• Validate BST |
| **14. Graph Routings** | Traversing interconnected nodes via structural connectivity matrices or tracking optimal weights. | O(V+E) | • Number of Islands<br>• Rotten Oranges<br>• Dijkstra's Algorithm |
| **15. Dynamic Programming** | Optimizing recursive workflows by breaking them down and caching sub-problem results. | Dependent on States | • Climbing Stairs<br>• House Robber<br>• 0/1 Knapsack |
| **16. Bit Manipulation**  | Dropping down to the raw binary bit level to manipulate digits using native logical operators (AND, OR, XOR, logical shifts) for optimized mask flag checking. | O(1) | • Single Number<br>• Number of 1 Bits<br>• Counting Bits |

---

### Daily Problem Breakdown Lifecycle

1. **Read and Deconstruct (10 Mins):** Identify the keywords. If it mentions "contiguous subarray," think Sliding Window or Kadane's. If it mentions "shortest path," think Graph BFS.
2. **Brute Force Scripting (15 Mins):** Write down or verbalize the brute force solution (O(n^2) or nested loops). Never optimize until you can explain the slow way first.
3. **Pattern Optimization (25 Mins):** Apply your pattern toolkit. Use your pointers, heaps, or maps to eliminate duplicate calculations and bring down the complexity.
4. **Java Code Review (10 Mins):** Verify memory footprints. Ensure you are cleanly allocating collections and using appropriate native classes (like `StringBuilder` for string edits or `PriorityQueue` for custom objects using lambdas/comparators).
