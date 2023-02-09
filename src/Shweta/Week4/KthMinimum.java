package Shweta.Week4;

import java.util.Arrays;

/**
 * nums = [2,3,45,4,53,12]
 * i
 * 0 1 2 3 4 5 6
 * Sorted nums = [2,3,4,12,45,53]
 * i
 * k=2, ans=3
 * k=1, ans=2
 * k=4, ans=2,3,4,12 = 12
 */
public class KthMinimum {

    public static void main(String[] args) {
        int[] nums = {2, 3, 45, 4, 5, 53, 12};
        int k = 3;
        System.out.println(kthSmallestOptimized(nums, k));
        System.out.println(kthSmallestBF(nums, k));
    }

    public static int kthSmallestOptimized(int[] nums, int k) {
        Arrays.sort(nums); // [2,3,4,12,45,53]
        return nums[k - 1];
    }

    // {2,3,45,4,53,12} k=3 -> [2,3,4,5,12,45,53]
    public static int kthSmallestBF(int[] nums, int k) {
        int kthSmallest = Integer.MAX_VALUE;
        // [2,3,4,5,12,45,53]
        Arrays.sort(nums);
        for (int i = 0; i < nums.length ; i++) {
            kthSmallest = (nums[i] > nums[i+1]) ?  i : i+1 ;
            if(kthSmallest == k){
                return nums[i];
            }
        }
        return kthSmallest;
    }
}
