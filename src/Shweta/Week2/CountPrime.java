package Shweta.Week2;

/**
 * LeetCode
 * 204. Count Primes
 * Given an integer n, return the number of prime numbers that are strictly less than n.
 * Example 1:
 * Input: n = 10
 * Output: 4
 * Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
 * Example 2:
 * Input: n = 0
 * Output: 0
 * Example 3:
 * Input: n = 1
 * Output: 0
 */
public class CountPrime {

    public static void main(String args[]) {
        int n = 10;
        int countPrime = countPrimes(n);
        System.out.println(countPrime);
    }

    public static int countPrimes(int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            int flag = 1;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = 0;
                }

            }
            if (flag == 1) {
                if (i != 0 && i != 1) {
                    count++;
                }
            }
        }
        return count;
    }
}