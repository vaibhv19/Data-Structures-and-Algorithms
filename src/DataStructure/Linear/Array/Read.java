package DataStructure.Linear.Array;

import java.util.Arrays;

public class Read {
    
    // Read/Get element at specific index
    public static int getElement(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
        }
        return arr[index];
    }
    
    // Read all elements from array
    public static void readAllElements(int[] arr) {
        System.out.println("Array elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index " + i + ": " + arr[i]);
        }
    }
    
    // Read element safely (return -1 if not found or index invalid)
    public static int getElementSafe(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            System.out.println("Invalid index: " + index);
            return -1;
        }
        return arr[index];
    }
    
    // Find element and return its index (first occurrence)
    public static int findElement(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1; // Element not found
    }
    
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        
        // Example 1: Get element at index 2
        System.out.println("Element at index 2: " + getElement(arr, 2));
        
        // Example 2: Read all elements
        readAllElements(arr);
        
        // Example 3: Get element safely
        System.out.println("Element at index 1 (safe): " + getElementSafe(arr, 1));
        System.out.println("Element at index 10 (safe): " + getElementSafe(arr, 10));
        
        // Example 4: Find element
        System.out.println("Index of element 30: " + findElement(arr, 30));
        System.out.println("Index of element 100: " + findElement(arr, 100));
    }
}

