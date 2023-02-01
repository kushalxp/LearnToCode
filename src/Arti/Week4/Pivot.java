package Arti.Week4;
public class Pivot {
    public int PivotIndex(){

        int[] arr= new int[]{1,6,-6};

        int sum=0;

        for(int j=0;j<=arr.length-1;j++){
            sum += arr[j];
            //return sum;
        }
        int leftsum=0;
        int rightsum;
        for (int i=0;i<=arr.length-1;i++){

            rightsum=sum-(leftsum+arr[i]);
            if(leftsum==rightsum){
                System.out.println(arr[i]);
                //return i;
            }
            leftsum=leftsum+arr[i];
        }
        return -1;
    }

}
