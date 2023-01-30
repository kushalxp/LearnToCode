package Shweta.Week2;

/**
 * when a non-primitive data type (e.g. objects, arrays, etc.) is passed
 * as an argument to a method,
 * a reference to the object (not a copy of the object) is passed.
 * This means that any changes made to the object within the method will
 * be reflected in the original object outside the method.
 * <p>
 * when a method is called and a primitive data type
 * (e.g. int, float, char, etc.) is passed as an argument,
 * a copy of its value is passed to the method, rather than
 * a reference to the variable.
 * This means that changes made to the argument within the method will
 * not be reflected in the original variable outside the method.
 */

import java.util.Arrays;

public class TestPassByValue {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(nums)); //=> [1,2,3,4,5]
        magic1(nums); //=> modifies the content of original array
        System.out.println(Arrays.toString(nums)); //=> [5,1,2,3,4]

        int test = 5;
        System.out.println(test); //=> 5
        magic2(test); //=> does not modify the content of original var
        System.out.println(test); //=> 5

    }

    public static void magic1(int[] nums) {
        nums[0] = 5;
    }

    public static void magic2(int x) {
        x = 10;
    }
}