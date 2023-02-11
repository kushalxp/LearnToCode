package Arti.Week4;

import java.util.Scanner;
public class CountPrimeNo {

    //input is n
    //1 method for count of primeno
    //1 method for checking is no prime or not

//    public static void main(String[] args) {
//        CountPrimeNo object = new CountPrimeNo();
//         int result = object.countPrimes(10);
//         System.out.println(result);
//
//    }
        public int countPrimes(int n){
            int count =1;
            if(n==0||n==1) {
                return 0;
            }
            for (int i=3;i<=n;i++) {
                boolean flag = isPrime(i);
                if (flag == true) {
                    count++;
                }
            }
            return count;
        }
        public boolean isPrime(int n){

            boolean flag=true;
            for(int i=2;i<n;i++){
                if(n%i==0){
                  flag=false;
                }
            }
            return flag;
        }
    }



