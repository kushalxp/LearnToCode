package Vijay.Week3;

import org.jetbrains.annotations.NotNull;

public class PlusOne {
    public static int @NotNull [] plusOne(int[] digits) {
        int arraySize = digits.length;
        int carry = 1;
        //123
        for(int i = arraySize - 1; i >= 0; i--) {
            if(digits[i] == 9) {
                digits[i] = 0;
            }
            else {
                digits[i] += carry;
                //carry--;
                return digits;
            }
        }
        if(carry == 1) {
            int[] reserveArray = new int[arraySize + 1];
            reserveArray[0] = 1;
            /*for(int i = 1; i <= arraySize; i++) {
                reserveArray[i] = digits[i - 1];
            }*/
            //here reserve array's rest of the indexes, since not initialised, are
            //'0' by default, and they have to be ZEROs which is why we have the carry as 1,
            //which means, we must have had all the elements of the original array a 9.
            return reserveArray;
        }
        return digits;
    }
}
