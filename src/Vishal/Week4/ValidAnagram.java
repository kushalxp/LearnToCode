package Vishal.Week4;

import java.util.Arrays;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        char temp1[] = s.toCharArray();
        char temp2[] = t.toCharArray();

        Arrays.sort(temp1);
        Arrays.sort(temp2);

        String str1 = new String(temp1);
        String str2 = new String(temp2);

        if(str1.equals(str2)){
            return true;
        }
        else{
            return false;
        }
    }
}
