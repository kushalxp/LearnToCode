package Arti.Week6;

import java.util.Arrays;

public class CountSortSolution {
    public static void main(String[] args) {
        int[] arr={1,1,3,3,5,4};// countArray={0,0,0,0,0,0}
        CountSortSolution object=new CountSortSolution();
        int[] result=object.countCheck(arr);
        System.out.println(Arrays.toString(result));
    }
    public int[] countCheck(int[] arr){
        int [] countArray=new int[arr.length];
        for(int i=0;i<arr.length;i++){

             int originalCount= countArray[arr[i]];//countArray={0,*0*,0,0,0,0}
             countArray[arr[i]]=originalCount+1;//countArray={0,1,0,0,0,0} at i=0 astana
            //final output {0,2,0,2,1,1}
        }
        return countSort(countArray);
    }

    public int[] countSort(int[] contedArray){
         //according to count,insert the index as value(if 0 no insertion)
        int[] sortedArray=new int[contedArray.length];
        int sortedArrayIndex=0;
        for(int i=0;i<contedArray.length;i++) {
            int occurance=contedArray[i];
            if (occurance != 0){
                while (occurance>0){
                    sortedArray[sortedArrayIndex]=i;
                    sortedArrayIndex++;
                    occurance--;
                }
            }
        }
        return sortedArray;
    }

}
