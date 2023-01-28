package Shweta.Week3;

import java.util.Arrays;

public class TwoDArrayTranspose {
    public static void main(String[] args) {
        int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        // Total TC = O(N^2) + O(N^2) = O(N^2)
        // Total SC = O(1) + O(1) + O(N^2) + O(1) + O(N) + O(N^2) + 0(N)
        //          = 3*O(1) + 2*O(N) + 2*O(N^2)
        //          = O(1) + O(N) + O(N^2)
        //          = O(N+N^2)
        //          = O(N^2)
        transpose(nums);
    }

    // SC = O(N^2) since 2D array is used
    public static void transpose(int[][] nums) {
        // SC = O(1)
        int rowsLen = nums.length;
        // SC = O(1)
        int colLen = nums[rowsLen - 1].length;
        // SC = O(N^2)
        int[][] temp = new int[colLen][rowsLen];
        System.out.println(Arrays.deepToString(nums));

        // TC = O(N^2)
        // SC = O(1)
        for (int row = 0; row < rowsLen; row++) {   // 0 ->1
            for (int col = 0; col < colLen; col++) {  //0 -> 1-> 2
                temp[row][col] = nums[col][row];
            }
        }
        System.out.println(Arrays.deepToString(temp));

        // SC = O(N)
        int[] revCol;
        // SC = O(N^2)
        int[][] arr = new int[temp.length][temp.length];
        // TC = O(N^2) + O(N) from reverse => O(N^2)
        // SC = 0(N)
        for (int row = 0; row < temp.length; row++) {
            for (int col = 0; col < temp[temp.length - 1].length; col++) { //
                revCol = reverseArray(temp[row]);
                arr[row][col] = revCol[col];
            }
        }
        System.out.print(Arrays.deepToString(arr));
    }

    private static int[] reverseArray(int[] nums) {
        int len = nums.length; // 6
        int start = 0;
        int end = len-1; //6

        while (start < end){ // 0<6 , 1<5, 2<4, 3<3!
            int temp;
            temp = nums[start]; //1 , 2
            nums[start] = nums[end]; //[7,2,3,4,5,6,7], [7,6,3,4,5,6,1]
            nums[end] = temp; // [7,2,3,4,5,6,1], [7,6,3,4,5,2,1]
            start++; //1, 2
            end--;  // 6,5
        }
        return nums;
    }

}
