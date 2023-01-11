package Vijay.Week1;

public class PrimeNumber {
    public static void printPrime() {
        int i, j;
        for (i = 2; i <= 10; i++) {
            for (j = 2; j < i; j++) {
                if (i % j == 0)
                    break;
            }
            if (i == j)
                System.out.println(i + " is prime!");
        }
    }
}
