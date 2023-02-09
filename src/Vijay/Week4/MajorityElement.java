package Vijay.Week4;

import java.util.Arrays;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        // int globalCounter = 1;
        // int localCounter = 1;
        // int majorityElement = nums[0];
        // for(int i = 0; i < nums.length; i++) {
        //     majorityElement = nums[i];
        //     for(int j = i + 1; j < nums.length; j++) {
        //         if(nums[j] == majorityElement) {
        //             localCounter++;
        //         }
        //     }
        //     if(localCounter > globalCounter) {
        //         globalCounter = localCounter;
        //     }
        //     localCounter = 1;
        // }
        // return majorityElement;

// Tried to shorten the runtime by sorting the array so that loop would not run for repetitive numbers.
// So the below logic is based on the fact that you are sorting the array otherwise
// it will not pass for a case like: [2,2,1,1,1,2,2]
        Arrays.sort(nums); // comment this and the below logic will fail!
        int globalCounter = 1;
        int localCounter = 1;
        int majorityIndex = nums[0];
        int majorityElement = majorityIndex;

        for(int i = 0; i < nums.length; i++) {
            majorityIndex = nums[i];
            for(int j = i + 1;j < nums.length; j++) {
                if(majorityIndex == nums[j]) {
                    localCounter++;
                    while(((j + 1) < nums.length) && (nums[j] == nums[j + 1])) {
                        j++;
                        localCounter++;
                        if(j > nums.length) {
                            break;
                        }
                    }
                }
                //Failing because of this portion, here I am trying not to check for indexes which "j" already checked.
                // i = j;
                // break;
                //this saves a bit of a time.
                i = j - 1;
                break;
            }
            if(localCounter > globalCounter) {
                globalCounter = localCounter;
                majorityElement = majorityIndex;
                localCounter = 1;
            }
        }
        return majorityElement;

    }
}
