package Gayatri.Week1;

public class PrimeNumber {
    public static void printPrime(){
        for(int i = 2; i < 11; i++) {
            if(isPrime(i)) {
                System.out.println(i + " is prime ");
            }
        }
    }
    public static boolean isPrime(int num) {
        for(int i = 2; i <= num-1; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
