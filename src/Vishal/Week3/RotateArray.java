package Vishal.Week3;

public class RotateArray {

    public void rotate(int[] nums, int k) {

        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[(i+k)%nums.length]=nums[i];
        }
        for(int i=0; i<arr.length; i++){
            nums[i]=arr[i];
        }

    }

}
