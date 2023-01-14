package Shweta.Week1;

public class PrimeNumber {
    public static void printPrimeNumbers() {
        int n = 10;
        for (int i = 0; i < n; i++) {
            int flag = 1;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = 0;
                }
            }
            if (flag == 1) {
                System.out.println(i);
            }
        }

    }


}
