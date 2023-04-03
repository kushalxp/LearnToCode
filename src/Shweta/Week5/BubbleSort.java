package Shweta.Week5;

import java.util.Arrays;

/**
 *  [7,1,2,5,3,4,6]
 *  Compare ele and next ele
 *  If ele > next elem then swap make flag as true / other way round
 *  else store flag as false
 */
public class BubbleSort {

    public static void main(String[] args){
        int[] nums = {7,1,2,5,3,4,6};
        bubbleSort(nums);
    }

    public static int[] bubbleSort(int[] nums){
        boolean t = false;
        int len = nums.length;
        while(t==false && len>1){
        //  TC=O(NlogN?) because while is executed until no swap found?
        // every element is checked with every other ele?? SC=O(1)
            t = true;
            for(int i=1; i<len; i++){
                if(nums[i-1] > nums[i]){
                    t = swap(i, i-1, nums);
                }
            }
            len--;
        }
        System.out.println(Arrays.toString(nums));
        return nums;
    }

    //TC= O(1), SC=O(1)
    public static boolean swap(int a, int b, int[] arr){
        int temp =arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return false;
    }

}
