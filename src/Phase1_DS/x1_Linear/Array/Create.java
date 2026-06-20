package Phase1_DS.x1_Linear.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Create {
    
    // Create array of specified size
    public static int[] createArray(int size) {
        return new int[size];
    }
    
    // Create array with initial values
    public static int[] createArrayWithValues(int... values) {
        return values;
    }
    
    // Create array from user input
    public static int[] createArrayFromInput(int size) {
        int[] arr = new int[size];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
    }
    
    // Create array with default values (all zeros)
    public static int[] createArrayWithDefaults(int size, int defaultValue) {
        int[] arr = new int[size];
        Arrays.fill(arr, defaultValue);
        return arr;
    }
    
    public static void main(String[] args) {
        // Example 1: Create array of size 5
        int[] arr1 = createArray(5);
        System.out.println("Array 1 (size 5): " + Arrays.toString(arr1));
        
        // Example 2: Create array with initial values
        int[] arr2 = createArrayWithValues(10, 20, 30, 40, 50);
        System.out.println("Array 2 (with values): " + Arrays.toString(arr2));
        
        // Example 3: Create array with default value 99
        int[] arr3 = createArrayWithDefaults(5, 99);
        System.out.println("Array 3 (default value 99): " + Arrays.toString(arr3));
    }
}
