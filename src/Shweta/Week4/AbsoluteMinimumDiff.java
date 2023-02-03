package Shweta.Week4;

import java.util.Arrays;

/**
 * nums = [1,3,5,8,23] => 2,2,3,15
 * ans = 2
 * Absolute difference is irrespective of positive or negative number when
 * two numbers are subtracted we return minimum array.
 * <p>
 * NOTE:
 * Whenever you need minimum number then assume minimum number as max
 * eg: min = Integer.MAX_VALUE
 * Whenever you need maximum number then assume maximum number as min
 * eg: min = Integer.MIN_VALUE
 */
public class AbsoluteMinimumDiff {

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 8, 23};
        ABS(nums);
    }

    // nums = [1,3,5,8,23] => 2,2,3,15
    public static void ABS(int[] nums) {
        int min = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length - 1; i++) {
            if (min > nums[i + 1] - nums[i]) {
                min = Math.abs(nums[i + 1]) - Math.abs(nums[i]);
            }
        }
        System.out.println(min);
    }
}
