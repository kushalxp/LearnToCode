package Shweta.Week2;

import java.util.Arrays;
import java.util.List;

/**
 * Input: n = 3
 * Output: ["1","2","Fizz"]
 *
 * Input: n = 5
 * Output: ["1","2","Fizz","4","Buzz"]
 *
 * Input: n = 15
 * Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
 *
 * Constraints: 1 <= n <= 104
 *
 * Given an integer n, return a string array answer (1-indexed) where:
 * answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
 * answer[i] == "Fizz" if i is divisible by 3.
 * answer[i] == "Buzz" if i is divisible by 5.
 * answer[i] == i (as a string) if none of the above conditions are true.
 */
public class FizzBuzz {

    public static void main(String[] args){
        int n = 3;
        System.out.println(fizzBuzz(n));
    }

    public static List<String> fizzBuzz(int n) {
        String[] answer = new String[n];

        for(int i=1; i<=n; i++){
            int count = i+1;
            if((i%3)==0 && (i%5)==0){
                // answer.set(i-1, "FizzBuzz");
                answer[i-1] = "FizzBuzz";
            }else if((i%3)==0){
                // answer.set(i-1, "Fizz");
                answer[i-1] = "Fizz";
            }else if((i%5)==0){
                // answer.set(i-1, "Buzz");
                answer[i-1] = "Buzz";
            }else{
                // answer.set(i-1, String.valueOf(i));
                answer[i-1] = String.valueOf(i);
            }
        }
        return Arrays.asList(answer);
    }
}
