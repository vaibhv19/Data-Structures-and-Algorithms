package Phase2_Patterns.x12_RecursionxBacktracking;

import java.util.*;

public class RecursionBacktracking {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println("Permutations: " + permute(s));
    }

    static List<String> permute(String s) {
        List<String> result = new ArrayList<>();
        backtrack(s.toCharArray(), 0, result);
        return result;
    }

    static void backtrack(char[] chars, int index, List<String> result) {
        if (index == chars.length) {
            result.add(new String(chars));
            return;
        }
        for (int i = index; i < chars.length; i++) {
            swap(chars, index, i);
            backtrack(chars, index + 1, result);
            swap(chars, index, i);
        }
    }

    static void swap(char[] arr, int i, int j) {
        char temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
    }
}
