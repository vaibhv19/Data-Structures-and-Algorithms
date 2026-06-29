package Phase1_DS.x1_Linear.Stack;

import java.util.ArrayList;

public class CRUDwAL {
    private ArrayList<Integer> list = new ArrayList<>();

    // CREATE / UPDATE (PUSH) - Add to the end of the list
    public void push(int data) {
        list.add(data);
    }

    // DELETE (POP) - Remove from the end of the list
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.remove(list.size() - 1);
    }

    // READ (PEEK) - View the last element
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.get(list.size() - 1);
    }

    // CHECK STATE
    public boolean isEmpty() {
        return list.size() == 0;
    }
}