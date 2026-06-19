package DataStructure.Linear.Array;

import java.util.Arrays;

public class Update {
    
    // Update element at specific index with new value
    public static void updateElement(int[] arr, int index, int newValue) {
        if (index < 0 || index >= arr.length) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
        }
        arr[index] = newValue;
    }
    
    // Update element safely (return true/false based on success)
    public static boolean updateElementSafe(int[] arr, int index, int newValue) {
        if (index < 0 || index >= arr.length) {
            System.out.println("Invalid index: " + index);
            return false;
        }
        arr[index] = newValue;
        return true;
    }
    
    // Replace all occurrences of oldValue with newValue
    public static void replaceAll(int[] arr, int oldValue, int newValue) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == oldValue) {
                arr[i] = newValue;
            }
        }
    }
    
    // Update multiple elements at once
    public static void updateMultipleElements(int[] arr, int[] indices, int[] newValues) {
        if (indices.length != newValues.length) {
            throw new IllegalArgumentException("Indices and values arrays must have same length");
        }
        for (int i = 0; i < indices.length; i++) {
            updateElement(arr, indices[i], newValues[i]);
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        
        System.out.println("Original array: " + Arrays.toString(arr));
        
        // Example 1: Update single element at index 2
        updateElement(arr, 2, 99);
        System.out.println("After updating index 2 to 99: " + Arrays.toString(arr));
        
        // Example 2: Update element safely
        boolean result = updateElementSafe(arr, 0, 100);
        System.out.println("Update at index 0: " + result);
        System.out.println("After safe update: " + Arrays.toString(arr));
        
        // Example 3: Replace all occurrences
        int[] arr2 = {5, 10, 5, 20, 5};
        System.out.println("\nArray 2 before replacing 5 with 15: " + Arrays.toString(arr2));
        replaceAll(arr2, 5, 15);
        System.out.println("Array 2 after replacing 5 with 15: " + Arrays.toString(arr2));
        
        // Example 4: Update multiple elements
        int[] arr3 = {1, 2, 3, 4, 5};
        int[] indices = {0, 2, 4};
        int[] values = {111, 333, 555};
        System.out.println("\nArray 3 before: " + Arrays.toString(arr3));
        updateMultipleElements(arr3, indices, values);
        System.out.println("Array 3 after updating indices [0,2,4]: " + Arrays.toString(arr3));
    }
}

