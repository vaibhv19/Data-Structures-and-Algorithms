package Phase1_DS.x1_Linear.Array;

import java.util.Arrays;

public class Delete {
    
    // Delete element at specific index and shift remaining elements
    public static int[] deleteElement(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
        }
        int[] newArr = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index) {
                newArr[j++] = arr[i];
            }
        }
        return newArr;
    }
    
    // Delete element safely (return null if index invalid)
    public static int[] deleteElementSafe(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            System.out.println("Invalid index: " + index);
            return null;
        }
        return deleteElement(arr, index);
    }
    
    // Delete all occurrences of a specific value
    public static int[] deleteAllOccurrences(int[] arr, int value) {
        int count = 0;
        // Count occurrences
        for (int num : arr) {
            if (num == value) {
                count++;
            }
        }
        
        int[] newArr = new int[arr.length - count];
        int j = 0;
        for (int num : arr) {
            if (num != value) {
                newArr[j++] = num;
            }
        }
        return newArr;
    }
    
    // Delete element at index in-place and return new size
    public static int deleteElementInPlace(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
        }
        // Shift elements to the left
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        return arr.length - 1; // Return new logical size
    }
    
    public static void main(String[] args) {
        // Example 1: Delete element at index
        int[] arr1 = {10, 20, 30, 40, 50};
        System.out.println("Original array: " + Arrays.toString(arr1));
        int[] result1 = deleteElement(arr1, 2);
        System.out.println("After deleting element at index 2: " + Arrays.toString(result1));
        
        // Example 2: Delete element safely
        int[] arr2 = {5, 10, 15, 20};
        System.out.println("\nArray 2 before: " + Arrays.toString(arr2));
        int[] result2 = deleteElementSafe(arr2, 1);
        if (result2 != null) {
            System.out.println("Array 2 after safe delete at index 1: " + Arrays.toString(result2));
        }
        
        // Example 3: Delete all occurrences of a value
        int[] arr3 = {1, 2, 3, 2, 4, 2, 5};
        System.out.println("\nArray 3 before deleting all 2s: " + Arrays.toString(arr3));
        int[] result3 = deleteAllOccurrences(arr3, 2);
        System.out.println("Array 3 after deleting all 2s: " + Arrays.toString(result3));
        
        // Example 4: Delete in-place
        int[] arr4 = {100, 200, 300, 400, 500};
        System.out.println("\nArray 4 before: " + Arrays.toString(arr4));
        int newSize = deleteElementInPlace(arr4, 3);
        System.out.println("Array 4 after in-place delete at index 3 (new size: " + newSize + "): " 
                            + Arrays.toString(Arrays.copyOf(arr4, newSize)));
    }
}

