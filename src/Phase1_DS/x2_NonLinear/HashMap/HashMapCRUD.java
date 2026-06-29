package Phase1_DS.x2_NonLinear.HashMap;

import java.util.*;

public class HashMapCRUD {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 1);
        map.put("banana", 2);
        System.out.println("Read apple: " + map.get("apple"));
        map.put("apple", 3);
        map.remove("banana");
        System.out.println("Final map: " + map);
    }
}
