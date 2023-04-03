package Shweta.Week5;

import java.util.Arrays;

public class FindTheDifference {
    public static void main(String[] args){
        String s = "abcd";
        String t = "abcde";
        findTheDifference(s, t);
    }
    public static char findTheDifference(String s, String t) {
        int i=0, j=0;
        char[] x=s.toCharArray();
        char[] y=t.toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        while(i<s.length() && j<t.length()){
            System.out.println(x[i]+"::"+y[j]);
            if(x[i]!=y[j]) {
                return y[j];
            }else{
                i++;
                j++;
            }
        }
        System.out.println(y[j]);
        return y[j];
    }
}
