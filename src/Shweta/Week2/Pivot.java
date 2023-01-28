package Shweta.Week2;

/**
 * Input: nums = [1,7,3,6,5,6]
 * Output: 3
 * Explanation:
 * The pivot index is 3.
 * Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
 * Right sum = nums[4] + nums[5] = 5 + 6 = 11
 *
 * Input: nums = [1,2,3]
 * Output: -1
 * Explanation:
 * There is no index that satisfies the conditions in the problem statement.
 *
 * Input: nums = [2,1,-1]
 * Output: 0
 * Explanation:
 * The pivot index is 0.
 * Left sum = 0 (no elements to the left of index 0)
 * Right sum = nums[1] + nums[2] = 1 + -1 = 0
 *
 * [-1,-1,0,1,1,0] -> 5
 * Constraints:
 * 1 <= nums.length <= 104
 * -1000 <= nums[i] <= 1000
 *
 * Given an array of integers nums, calculate the pivot index of this array.
 * The pivot index is the index where the sum of all the numbers strictly to the left
 * of the index is equal to the sum of all the numbers strictly to the index's right.
 * If the index is on the left edge of the array, then the left sum is 0 because there are
 * no elements to the left. This also applies to the right edge of the array.
 * Return the leftmost pivot index. If no such index exists, return -1.
 */
public class Pivot {

    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        System.out.println(pivotIndex(nums));
        System.out.println(optimizePivot(nums));
    }

    public static int optimizePivot(int[] nums) {

        int rightSum = 0;
        int leftSum = 0;
        for(int i=1; i<=nums.length-1 ;i++){
            rightSum = rightSum+nums[i];
        }
        if(rightSum==leftSum){
            return 0;
        }
        for(int i=1; i<=nums.length-1;i++){
            System.out.println("RightSum: " + rightSum +"; LeftSum: " + leftSum);
            leftSum = leftSum + nums[i-1];
            rightSum = rightSum - nums[i] ;
            if(rightSum==leftSum){
                return i;
            }
        }
        return -1;
    }

    // nums = [-1,-1,0,1,1,0] => 5
    public static int optimizePivot_Bug(int[] nums){
        int rightSum = 0;
        int leftSum = 0;
        for(int i=1; i<=nums.length-1 ;i++){
            leftSum = leftSum+nums[i];
        }
        for(int i=0; i<nums.length-1;i++){
            System.out.println("RightSum: " + rightSum +"; LeftSum: " + leftSum);
            if(rightSum==leftSum){
                return i;
            }else {
                rightSum = rightSum + nums[i];
                leftSum = leftSum - nums[i+1];
            }
        }
        return -1;
    }

    public static int pivotIndex(int[] nums) {

        int sumLeftIndex = 0;
        int sumRightIndex = 0;

        // [1,7,3,6,5,6]
        // [0,1,2,3,4,5]
        // 0 ~ less than length
        for (int i = 0; i < nums.length; i++) {
            sumRightIndex = 0;
            sumLeftIndex = 0;
            for (int k = i - 1; k >= 0; k--) {
                sumLeftIndex += nums[k];
            }

            for (int j = i + 1; j < nums.length; j++) {
                // 0 = 0 + nums[0+1] = nums[1] = 1 => 1
                // 1 = 1 + nums[2] = 2
                sumRightIndex += nums[j];
            }

            if (sumLeftIndex == sumRightIndex) {
                return i;
            }
        }

        return -1;
    }

}
