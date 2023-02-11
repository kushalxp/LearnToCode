package Arti.Week5;

import java.util.HashMap;
import java.util.Map;

public class EvenOddSolution {

    public static void main(String[] args) {
        int[] arr= {10,2,3,5,7,1};
        EvenOddSolution object =new EvenOddSolution();
        Map<String,Integer> result= new HashMap<String,Integer>();
        result= object.evenOddCount(arr);
        System.out.println(result);
    }
    public Map<String,Integer> evenOddCount(int[] arr){

        int evenCount=0;
        for(int i=0;i< arr.length;i++){
            boolean evenFlag =isEven(arr[i]);
            if(evenFlag==true){
                evenCount++;
            }
        }
        int oddCount= arr.length-evenCount;

        Map<String,Integer> oddEvenResultMap = new HashMap<String, Integer>();
        oddEvenResultMap.put("Even",evenCount);
        oddEvenResultMap.put("Odd",oddCount);
        return oddEvenResultMap;
    }

    public boolean isEven(int n){

        boolean flag=false;
        if(n%2==0){
            flag=true;
        }
        return flag;
    }

}
