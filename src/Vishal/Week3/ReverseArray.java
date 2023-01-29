package Vishal.Week3;

public class ReverseArray {


    public int[] reverseArray(int[] arr)
    {
        int temp1;
        int temp2;
        for(int i=0; i<arr.length/2; i++){
            temp1 = arr[i];
            temp2 = arr[(arr.length-1) - i];

            arr[i] = temp2;
            arr[(arr.length-1) - i] = temp1;
        }
        return arr;
    }

}
