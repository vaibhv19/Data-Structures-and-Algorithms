package com.BasicDataStructure;

public class ArrayDemo {
    public static void main(String[] args) {

        // Declaration and Initialization
        int[] arr = {10, 20, 30, 40, 50};

        // Display elements
        System.out.println("Array Elements:");

        for(int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

        // Modify an element
        arr[2] = 35;

        System.out.println("\nAfter Modification:");

        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}