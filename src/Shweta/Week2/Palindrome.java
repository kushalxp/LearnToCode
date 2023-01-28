package Shweta.Week2;

public class Palindrome {

    public static void main(String[] args) {
//        String s = "!ds$3GgSd";
        String s="! $a3b3A!";
        System.out.print(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
                continue;
            }
            if (Character.toLowerCase(s.charAt(left)) !=
                    Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            right--;
            left++;
        }
        return true;
    }
}