package Arti.Week3;

import org.omg.Messaging.SyncScopeHelper;

public class PrimeNo {

    public static void PrimeNo(){

        int flag=0;
        int m=15;

        if(m==0||m==1){
            System.out.print(m+ " is not prime no");
        }else{
            for(int i=2;i<=m/2;i++){
                if((m%i==0)&&(i<m)) {
                    flag =0;
                    break;
                }else {

                    flag=1;
                }
            }
            if(flag==1) {
                System.out.println(m + " is prime no");
            }else {
                System.out.println(m + " is not prime no");
            }
        }



    }
}
