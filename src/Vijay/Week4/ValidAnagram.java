package Vijay.Week4;

import java.util.Arrays;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if((s != null && !(s.isEmpty())) && (t != null && !(t.isEmpty()))) {
            for(int i = 0; i < s.length(); i++) {
                if(!(Character.isLetter(s.charAt(i)))) {
                    return false;
                }
            }
        }
        else {
            return false;
        }
        if(s.length() != t.length()) {
            return false;
        }

        s.toLowerCase();
        t.toLowerCase();
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        Arrays.sort(sChar);
        Arrays.sort(tChar);

        for(int i = 0; i < s.length(); i++) {
            if(sChar[i] != tChar[i]) {
                return false;
            }
        }
        return true;
    }
}
