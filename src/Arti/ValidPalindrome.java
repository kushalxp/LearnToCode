package Arti;

import java.util.Locale;

public class ValidPalindrome {

    public static void StringPalindrome(){
        int flag=0;
        String str = "ar ra";

        String LC= str.toLowerCase();

        String RC = LC.replace(" ","");

        for(int i=0;i<=str.length()/2;i++){

            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                  flag=1;
                  break;
            }
        }

        if(flag==1){
            System.out.println("inValid Palindrome");
        }else{
            System.out.println("Valid Palindrome");
        }

    }

}
