package Vishal.Week1;

public class Pivot {

    public int pivotIndex(int[] nums) {

        int leftSum=0;
        int rightSum=0;

        for (int i = 0; i<nums.length; i++){

            if(i<nums.length){
                for(int j=nums.length-1; j>i; j--){
                    rightSum += nums[j];
                }
            }
            if(i>0){
                for(int k=i-1; k>=0; k--)
                {
                    leftSum += nums[k];
                }
            }
            System.out.println("Left = " + leftSum + "Right = " + rightSum );
            if(leftSum==rightSum)
            {
                return i;
            }
            leftSum = 0;
            rightSum =0;
        }
        return -1;
    }
}
