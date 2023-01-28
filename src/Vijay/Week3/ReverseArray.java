package Vijay.Week3;

import org.jetbrains.annotations.NotNull;

public class ReverseArray {
    int[] arr = {1,2,3,4,5,6,7};
    public static int[] reverseArray(int @NotNull [] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int a = arr[i];
            arr[i] = arr[(arr.length - 1) - i];
            arr[(arr.length - 1) - i] = a;
        }
        return arr;
    }
}