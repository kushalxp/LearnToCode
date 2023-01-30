package Vishal.Week1;

public class PrimeNumber {

    public static boolean isprime(int n){

        for(int x = 2; x <= n/2; x++){
            if(n % x == 0){
                return false;
            }
        }
        return true;
    }
}
