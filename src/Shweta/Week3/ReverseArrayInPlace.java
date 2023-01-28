package Shweta.Week3;

import java.util.Arrays;

public class ReverseArrayInPlace {
    public static void main(String[] args) {
        int[] s = {1, 2, 3, 4, 5};
        System.out.println((reverseInPlace(s)));
    }

    public static String reverseInPlace(int[] s) {
        int start=0;
        int end=s.length-1;
        while(start < end ){
            int temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
        return Arrays.toString(s);
    }
}
