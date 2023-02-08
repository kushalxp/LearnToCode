package Vishal.Week4;

import java.util.Arrays;

public class NobleNumber {

    public boolean isNoble(int[] nums)  {
        for(int i = 0; i < nums.length; i++) {
            int currNum = nums[i];
            int count = 0;
            for(int j= 0; j < nums.length; j++) {
                if(nums[j] > currNum) {
                    count++;
                    if(count > currNum) {
                        break;
                    }
                }
            }
            if(count == currNum) {
                return true;
            }
        }
        return false;
    }

    public boolean isNobleOptimized(int[] nums){

        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == (nums.length-i-1)) {
                return true;
            }
        }
        return false;

    }


}
