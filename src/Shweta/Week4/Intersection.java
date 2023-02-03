package Shweta.Week4;

import java.util.Arrays;

/**
 * Given two integer arrays nums1 and nums2, return an array of their
 * intersection. Each element in the result must be unique and
 * you may return the result in any order.
 * <p>
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2]
 * <p>
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [9,4]
 * Explanation: [4,9] is also accepted.
 */
public class Intersection {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        nums1 = removeDuplicate(nums1);
        nums2 = removeDuplicate(nums2);

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        nums1 = removeDuplicate(nums1);
        nums2 = removeDuplicate(nums2);

        int i = 0, j = 0, count = 0;
        int[] result = new int[Math.min(nums1.length, nums2.length)];

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                if (count == 0 || result[count - 1] != nums1[i]) {
                    result[count++] = nums1[i];
                }
                i++;
                j++;
            }
        }
        int[] result1 = new int[count];
        for (int k = 0; k < count; k++) {
            result1[k] = result[k];
        }
        return result1;
    }

    public static int[] removeDuplicate(int[] nums) {
        int count = 0;
        int[] noDuplicates = new int[nums.length];
        noDuplicates[count++] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                noDuplicates[count++] = nums[i];
            }
        }
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = noDuplicates[i];
        }
        return result;
    }
}
