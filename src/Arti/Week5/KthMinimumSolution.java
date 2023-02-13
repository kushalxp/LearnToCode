package Arti.Week5;

import java.util.Arrays;

public class KthMinimumSolution {
    public int kthMin(int[] arr,int k){

          Arrays.sort(arr);
          return arr[k-1];
    }
}
