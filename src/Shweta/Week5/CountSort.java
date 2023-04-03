package Shweta.Week5;

import java.util.Arrays;

/**
 * Max value in the array should be equal or less than its length/size
 * auxiliary space
 */
public class CountSort {
    public static void main(String[] args){
        int[] nums = {6,6,4,5,1,3,2,4,0};
        countSort(nums);
    }

    private static void countSort(int[] nums) {
        int[] count = new int[nums.length];
        System.out.println(Arrays.toString(nums));

        for(int i=0; i<nums.length; i++){
            count[nums[i]] = count[nums[i]] + 1;
        }
        System.out.println(Arrays.toString(count));

        for(int i=0;i<count.length;i++){
            int countIndex = i;

            while(count[i] > 0){
                nums[countIndex] = i;
                countIndex++;
                count[i]--;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
