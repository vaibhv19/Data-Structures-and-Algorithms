package Phase1_DS.x2_NonLinear.HashSet;

import java.util.*;

public class HashSetCRUD {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(10);
        System.out.println("HashSet contents: " + set);
        System.out.println("Contains 20? " + set.contains(20));
        set.remove(20);
        System.out.println("After remove 20: " + set);
    }
}
