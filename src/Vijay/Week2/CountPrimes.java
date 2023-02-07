package Vijay.Week2;

public class CountPrimes {
    //Time limit exceeds for n = 499979
    public static int countPrimes(int n) {
        int i,j,count = 0;
        if(n == 0 || n == 1) {
            return 0;
        }
        for (i = 2; i < n; i++) {
            for (j = 2; j < i; j++) {
                if (i % j == 0)
                    break;
            }
            if (i == j){
                count++;
            }
        }
        return count;
    }

}
