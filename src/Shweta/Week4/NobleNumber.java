package Shweta.Week4;

import java.util.Arrays;

/**
 * nums = [1,3,2,3,4,5,6]
 * Noble number is 3
 * Why? There are 3 numbers greater than 3.
 * Therefore, 3 is noble number.
 * <p>
 * nums = [1,2,3,4]
 * Noble number is 2
 * Why? There are 2 numbers greater than 2.
 * Therefore, 2 is noble number.
 */
public class NobleNumber {

    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 3, 4, 5, 6};
        System.out.println(nobleNumber(nums));
    }

    public static int nobleNumber(int[] nums) {
        int noble = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums.length - 1 - i) {
                noble = nums[i];
                return noble;
            }
        }
        return noble;
    }
}
