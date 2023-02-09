package Shweta.Week4;

import java.util.Arrays;

/**
 * You are given a non-negative integer array nums. In one operation, you must:
 *
 * Choose a positive integer x such that x is less than or equal to the smallest non-zero element in nums.
 * Subtract x from every positive element in nums.
 * Return the minimum number of operations to make every element in nums equal to 0.
 *
 * Input: nums = [1,5,0,3,5]
 * Output: 3
 * Explanation:
 * In the first operation, choose x = 1. Now, nums = [0,4,0,2,4].
 * In the second operation, choose x = 2. Now, nums = [0,2,0,0,2].
 * In the third operation, choose x = 2. Now, nums = [0,0,0,0,0].
 *
 * Input: nums = [0]
 * Output: 0
 * Explanation: Each element in nums is already 0 so no operations are needed.
 */
public class MinimumOperations {

    public static void main(String[] args){
        int[] nums = {};
        minimumOperations(nums);
    }
    public static int minimumOperations(int[] nums) {

        int x=0;
        Arrays.sort(nums);

        while(true){
            int min = Integer.MAX_VALUE;
            for(int i=0; i<nums.length; i++){
                if(nums[i] < min && nums[i] != 0){
                    min = nums[i];
                }
            }
            if(min==Integer.MAX_VALUE){
                return x;
            }
            x++;
            for(int i=0; i<nums.length; i++){
                if(nums[i] == 0){
                    // do nothing
                }
                if(nums[i] != 0){
                    nums[i] = nums[i]-min;
                }

            }
        }
    }
}
