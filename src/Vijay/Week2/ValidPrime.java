package Vijay.Week2;

public class ValidPrime {
    public static void validPrime() {
        int n = 5;
        int counter;
        if (n == 0 || n == 1) {
            System.out.println(n + " is not a Prime number..");
        }
        for (counter = 2; counter <= n/2; counter++) {
            if(n % counter  == 0) {
                System.out.println(n + " is not a Prime number..");
                break;
            }
        }
        if (counter <= n) {
            System.out.println(n + " is a Prime number!");
        }
    }
}
