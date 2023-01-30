package Shweta.Week3;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] s = {1, 2, 3, 4, 5};
        System.out.println((reverse(s)));
    }

    public static String reverse(int[] s) {
        int[] s1 = new int[s.length];
        int i = 0;
        for (int j = s.length - 1; j >= 0; j--) {
            s1[i] = s[j];
            i++;
        }
        return Arrays.toString(s1);
    }
}
