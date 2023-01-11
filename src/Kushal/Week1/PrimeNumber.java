package Kushal.Week1;

public class PrimeNumber {

    public void printPrime(){
        for(int i = 2; i < 11; i++) {
            if(isPrime(i)) {
                System.out.println(i + " is prime ");
            }
        }
    }
    public boolean isPrime(int num) {
        for(int i = 2; i <= num-1; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
