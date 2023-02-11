package Arti.Week6;

import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil;

import java.util.Arrays;

public class ArraySorting {

        public int[] sortArray(int[] nums) {

            for (int i = 0; i < nums.length; i++) {
                int j = indexMinValue(i, nums);
                swap(i, j, nums);

            }
            return nums;
        }
            //find min
            public int indexMinValue(int index,int[] nums){
                int min=Integer.MAX_VALUE;
                int minindex=0;

                for(int j=index;j<nums.length;j++){
                    if(nums[j]<min){
                        min=nums[j];
                        minindex=j;
                    }
                }
                return minindex;
            }
            //swap
            public void swap(int i,int j,int[] nums){

                int temp=nums[i];
                nums[i] = nums[j];
                nums[j]= temp;
            }
        }

