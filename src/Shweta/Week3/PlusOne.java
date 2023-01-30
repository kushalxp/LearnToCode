package Shweta.Week3;

import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {
        int[] digits = {9,9,9};
        System.out.println(Arrays.toString(onePlus(digits)));
    }

    public static int[] onePlus(int[] digits){
        int carry = 1;
        int end = digits.length;
        int[] plusOne = new int[digits.length+1];

        // As addition is done from right to left
        // loop is running from last to first element i.e [9,2,9] = 2~0
        for(int i=end-1; i>=0; i--){
            // check if carry is 1, which at start we assumed to be 1
            if(carry!=0){
                // check if element is 9, because we know sum will be 2 digit
                // and then only need to carry as 1 and sum as 0
                if(digits[i] == 9){
                    digits[i] = 0;
                    carry = 1;
                }else {
                    // now we know element is not 9 so sum be 1 digit
                    // simply add the element in place
                    digits[i] = digits[i] + 1;
                    return digits;
                }
            }
        }
        // when carry is 1 we will need array with +1 size
        // always its 0th position will be 1
        // this condition will only be true when carry is 1, and we are already
        // checking the condition when element is 9 so
        // no need to copy remaining digits => NOTE
        if(carry==1){
            plusOne[0] = 1;
//            for(int i=1; i<=digits.length;i++){
//                plusOne[i] = digits[i-1];
//            }
            return plusOne;
        }
        return digits;
    }


//    public static int[] plusOne(int[] digits) {
//        StringBuilder sb = new StringBuilder();
//
//        for(int i=0;i<digits.length;i++){
//            sb.append(digits[i]);
//        }
//
//        String a = sb.toString();
//        int a1 = Integer.valueOf(a) + 1;
//        String b = String.valueOf(a1);
//        int result[] = new int[]{Integer.parseInt(b)};
//
//        return result;
//    }
}
