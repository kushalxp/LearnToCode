package Arti.Week4;

import java.util.Arrays;

public class ReverseArray {

    public static void ReverseArray(){

        int[] a=new int[]{1,2,3,4};

        for(int i=0; i<=(a.length-1)/2;i++){

            int temp=a[a.length-i-1];
            a[a.length-i-1]=a[i];
            a[i]=temp;

                System.out.print(Arrays.toString(a));
            }

            }

}
