package Vishal.Week2;

public class CountPrime {
        public int countPrimes(int n) {
            int count = 0;
            for(int i = 2; i < n; i++){
                if(isprime(i)){
                    count++;
                }
            }
            return count;
        }
        public static boolean isprime(int n){

            for(int x = 2; x <= n/2; x++){
                if(n % x == 0){
                    return false;
                }
            }
            return true;
        }

}
