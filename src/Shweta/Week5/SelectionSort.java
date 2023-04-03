package Shweta.Week5;

import java.util.Arrays;

/**
 * Selection sort
 * ek ek ele select karte hai aur sort karte hai
 * Start by dividing array into 2 parts sorted and unsorted
 * findmin if found then swap
 */
public class SelectionSort {

    public static void main(String[] args){
        int[] nums = {7,1,2,5,3,4,6};
        selectionSort(nums);
    }
    // TC=O(N^2) SC=O(1) overall Complexities
    public static int[] selectionSort(int[] nums){
        for(int i=0; i<nums.length; i++){
            int j= findMinIndex(nums, i);
            swap(i,j,nums);
        }
        System.out.println(Arrays.toString(nums));
        return nums;
    }

    //TC= O(1), SC=O(1)
    public static void swap(int a, int b, int[] arr){
        int temp =arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    //TC = O(N),  SC = O(1)
    // [7,1,2,5,3,4,6]
    public static int findMinIndex(int[] arr, int index){
        int min = Integer.MAX_VALUE;  // 999
        int minIndex = 0;
        for(int i=index; i<arr.length; i++){
            //to find minimum compare ele with all elem
            if(arr[i] < min){
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

}
