package Vishal.Week4;

import java.util.Arrays;

public class AbsoluteMinDiff {

    public int absoluteMinDiff(int[] nums) {

        Arrays.sort(nums);
        int minimum = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length-1; i++) {
            if(Math.abs(nums[i+1] - nums[i]) < minimum) {
                minimum =1 ;
            }
        }
        return minimum;
    }


}
