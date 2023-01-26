package Shweta.Week2;

import java.util.Arrays;

import static Shweta.Week2.TestPassByValue.magic;

public class TestPassByValue {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(Arrays.toString(nums)); //=> [1,2,3,4,5]
        magic(nums);
        System.out.println(Arrays.toString(nums)); //=> [1,2,3,4,5]
    }



    public static void magic(int[] nums) {
        nums[0] = 5;
    }

}
