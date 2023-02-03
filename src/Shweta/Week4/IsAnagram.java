package Shweta.Week4;

import java.util.Arrays;


/**
 * Given two strings s and t, return true if t is an anagram of s,
 * and false otherwise.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a
 * different word or phrase, typically using all the original letters
 * exactly once.
 *
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 *
 * Input: s = "rat", t = "car"
 * Output: false
 *
 */
public class IsAnagram {

    public static void main(String[] args){
        String s = "anagram";
        String t = "nagaram";
        isAnagram(s, t);
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] sChar = new char[s.length()];
        char[] tChar = new char[t.length()];
        for(int i=0; i<s.length(); i++){
            sChar[i] = s.charAt(i);
            tChar[i] = t.charAt(i);
        }
        Arrays.sort(sChar);
        Arrays.sort(tChar);
        System.out.println(Arrays.toString(sChar));
        System.out.println(Arrays.toString(tChar));
        for(int i=0; i<sChar.length; i++){
            if(sChar[i] != tChar[i]){
                return false;
            }
        }
        return true;
    }
}
