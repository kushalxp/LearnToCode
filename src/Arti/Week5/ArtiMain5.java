package Arti.Week5;

import java.util.EnumSet;

public class ArtiMain5 {

    public void run(){

//        int[] nums= {0,1,3,5,7,9};
//       BinarySearch object= new BinarySearch();
//       int result=object.search(nums,1);
//        System.out.println(result);

        int[] nums={2,1,0,4,7,8};
        KthMinimumSolution object= new KthMinimumSolution();
        int result=object.kthMin(nums,3);
        System.out.println(result);
    }
}
