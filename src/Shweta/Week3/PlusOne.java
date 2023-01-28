package Shweta.Week3;

import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {
        int[] digits = {1,2,3};
        System.out.println(Arrays.toString(onePlus(digits)));
    }

    public static int[] onePlus(int[] digits){
        int carry = 1;
        int sum = 0;
        int end = digits.length;
        int[] plusOne = new int[digits.length+1];

        for(int i=end-1; i>=0; i--){
            if(carry!=0){
                if(digits[i] == 9){
                    digits[i] = 0;
                    carry = 1;
                }else {
                    digits[i] = digits[i] + 1;
                    return digits;
                }
            }
        }
        if(carry==1){
            plusOne[0] = 1;
            for(int i=1; i<=digits.length;i++){
                plusOne[i] = digits[i-1];
            }
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
