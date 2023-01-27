package Vijay.Week1;

public class PivotIndex {
    public int pivotIndex(int[] nums) {
        long leftSum = 0;
        long rightSum = 0;
        int index;

        // for(int i = 0; i < nums.length; i++) {
        //     leftSum = 0;
        //     for(int j = i - 1; j >= 0; j--) {
        //         leftSum += nums[j];
        //     }
        //     rightSum = 0;
        //     for(int j = i + 1; j < nums.length; j++) {
        //         rightSum += nums[j];
        //     }
        //     if(leftSum == rightSum)
        //         return i;
        // }
        // return -1;

        for(int i = 1; i < nums.length; i++) {
            rightSum += nums[i];
        }
        if (leftSum == rightSum) {
            return 0;
        }
        for(int i = 1; i < nums.length; i++) {
            rightSum -= nums[i];
            leftSum += nums[i - 1];
            if (leftSum == rightSum) {
                return i;
            }
        }
        return -1;
    }
}
