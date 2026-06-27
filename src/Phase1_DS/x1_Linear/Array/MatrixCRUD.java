package Phase1_DS.x1_Linear.Array;

import java.util.Scanner;

public class MatrixCRUD {
    public static void main(String[] args) {


        //It's just an array of array... uses one extraa looop for each operation
        //------Creating a Matrix------

        // type[][] matrixName = new type[rows][cols];
        int[][] matrix = new int[3][3];
        int[][] matrix1 = new int[3][3];

        // type[][] matrixName = {{1,2},{3,4}};
        int[][] matrix2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        //------Updating a Matrix------

        // Updating specific positions
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[1][0] = 3;
        matrix[1][1] = 4;

        // Taking user input
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print("Enter element at [" + i + "][" + j + "]: ");
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println();

        //------Reading a Matrix------

        // Reading one element
        System.out.println("Element at [1][1]: " + matrix2[1][1]);

        // Reading the entire matrix
        System.out.println("Matrix:");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        //------Deleting an Element------

        // In matrices, deletion is usually simulated by
        // replacing the value with a default value.

        int[][] matrix3 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int deleteRow = 1;
        int deleteCol = 1;

        matrix3[deleteRow][deleteCol] = 0;

        System.out.println("After Deletion:");
        for (int i = 0; i < matrix3.length; i++) {
            for (int j = 0; j < matrix3[i].length; j++) {
                System.out.print(matrix3[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        //------Inserting an Element------

        // Since a matrix has fixed dimensions,
        // insertion is usually updating an empty/default slot.

        int[][] matrix4 = new int[3][3];

        matrix4[0][0] = 1;
        matrix4[0][1] = 2;
        matrix4[1][0] = 3;

        int insertRow = 1;
        int insertCol = 1;
        int insertValue = 4;

        matrix4[insertRow][insertCol] = insertValue;

        System.out.println("After Insertion:");
        for (int i = 0; i < matrix4.length; i++) {
            for (int j = 0; j < matrix4[i].length; j++) {
                System.out.print(matrix4[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

// Solved LeetCode #1672 (Richest Customer Wealth)