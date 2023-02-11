package Arti.Week6;

import java.util.Arrays;

public class MainArti6 {

    public void run(){

        int[] arr={2,5,1,6,8};
        ArraySorting SortedArray=new ArraySorting();
        int[] result=SortedArray.sortArray(arr);
        System.out.println(Arrays.toString(result));

    }
}
