package Vijay.Week2;

import java.util.Arrays;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        String[] answer = new String[n];
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                //System.out.println("Divisible by both");
                answer[i - 1] = "FizzBuzz";
            }
            else if (i % 3 == 0) {
                //System.out.println("divisible by 3");
                answer[i - 1] = "Fizz";
            }
            else if (i % 5 == 0) {
                //System.out.println("Divisible by 5");
                answer[i - 1] = "Buzz";
            }
            else {
                //System.out.println("Take your number back!");
                answer[i - 1] = Integer.toString(i);
            }
        }
        return Arrays.asList(answer);
    }
}
