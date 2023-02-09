package Shweta.Week4;

import java.util.Arrays;

/**
 * Given an array nums of size n, return the majority element.
 * The majority element is the element that appears more than ⌊n / 2⌋ times.
 * You may assume that the majority element always exists in the array.
 * <p>
 * Input: nums = [3,2,3]
 * Output: 3
 * <p>
 * Input: nums = [2,2,1,1,1,2,2]
 * Output: 2
 */
public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        majorityElement(nums);
    }

    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int max = 1;
        int prev = 0;
        int next = 0;
        if (nums.length == 1) {
            return nums[0];
        }
        for (int i = 1; i < nums.length; i++) {
            System.out.println(i + " < " + (nums.length));
            next = nums[i];
            System.out.println("next::" + next);
            prev = nums[i - 1];
            System.out.println("prev::" + prev);
            if (prev == next) {
                max++;
            }
            if (max == (nums.length + 1) / 2) {
                return nums[i - 1];
            }
        }
        return max;
    }
}
