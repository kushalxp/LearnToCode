package Vijay.Week3;

import org.jetbrains.annotations.NotNull;

public class PlusOne {
    public static int @NotNull [] plusOne(int[] digits) {
        int arraySize = digits.length;
        int carry = 1;
        for(int i = arraySize - 1; i >= 0; i--) {
            if(digits[i] == 9) {
                digits[i] = 0;
            }
            else {
                digits[i] += carry;
                carry--;
                return digits;
            }
        }
        if(carry == 1) {
            int[] reserveArray = new int[arraySize + 1];
            reserveArray[0] = carry;
            for(int i = 1; i <= arraySize; i++) {
                reserveArray[i] = digits[i - 1];
            }
            return reserveArray;
        }
        return digits;
    }
}
