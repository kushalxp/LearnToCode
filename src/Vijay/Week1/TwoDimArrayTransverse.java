package Vijay.Week1;

import java.util.Arrays;

public class TwoDimArrayTransverse {
    public static void twoDimArrayTransverse() {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int halfSizeOfArray = arr.length/2;
        int sizeOfArray = arr.length;
        int currentRowLength, currentRowHalfLength;

        System.out.println("Given Input 2-Dimensional Array");
        for (int row = 0; row < sizeOfArray; row++) {
            System.out.print("{ ");
            currentRowLength = arr[row].length;
            for (int col = 0; col < currentRowLength; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println("}");
        }
        System.out.println();

        for (int row = 0; row <= halfSizeOfArray; row++) {
            currentRowLength = arr[row].length;
            for (int col = row + 1; col < currentRowLength; col++) {
                int holder = arr[row][col];
                arr[row][col] = arr[col][row];
                arr[col][row] = holder;
            }
        }

        System.out.println("Input 2-Dimensional Array after row and column swap");
        for (int row = 0; row < sizeOfArray; row++) {
            System.out.print("{ ");
            currentRowLength = arr[row].length;
            for (int col = 0; col < currentRowLength; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println("}");
        }
        System.out.println();

        for (int row = 0; row < sizeOfArray; row++) {
            currentRowHalfLength = arr[row].length/2;
            currentRowLength = arr[row].length;
            for (int col = 0; col < currentRowHalfLength; col++) {
                int holder = arr[row][col];
                arr[row][col] = arr[row][currentRowLength - 1 - col];
                arr[row][arr[row].length - 1 - col] = holder;
            }
        }

        System.out.println("Final transposed 2-Dimensional Array");
        for (int row = 0; row < sizeOfArray; row++) {
            System.out.print("{ ");
            currentRowLength = arr[row].length;
            for (int col = 0; col < currentRowLength; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println("}");
        }
    }
}
