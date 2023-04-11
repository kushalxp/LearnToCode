package Shweta.Week5;

import java.util.Arrays;

public class SquaresOfSortedArrays {

    public static void main(String[] args){
        int[] nums = {-4,-1,0,3,10};
        sortedSquares(nums);
    }
    public static int[] sortedSquares(int[] nums) {
        for(int i=0; i<nums.length; i++){
            nums[i] = calculateSquare(nums[i]);
        }

        Arrays.sort(nums);
        System.out.println(nums);
        return nums;
    }

    public static int calculateSquare(int num){
        int square = num * num;
        return square;
    }
}
