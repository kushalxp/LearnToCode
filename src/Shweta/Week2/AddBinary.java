package Shweta.Week2;

/**
 * Given two binary strings a and b, return their sum as a binary string.
 *
 * Input: a = "11", b = "1"
 * Output: "100"
 *
 * Input: a = "1010", b = "1011"
 * Output: "10101"
 *
 * Constraints:
 * 1 <= a.length, b.length <= 104
 * a and b consist only of '0' or '1' characters.
 * Each string does not contain leading zeros except for the zero itself.
 *
 */
public class AddBinary {

    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        System.out.println(addBinary(a, b));
    }

    public static String addBinary(String a, String b) {

        StringBuilder sb = new StringBuilder();
        int carryon=0;
        int sum = 0;
        int a1=0;
        int b1=0;
        int i =  a.length()-1;
        int j =  b.length()-1;

        while (i >= 0 || j >= 0) {
            a1 = i>=0 ? convertCharToInt(a.charAt(i)) : 0;
            b1 = j>=0 ? convertCharToInt(b.charAt(j)) : 0;
            sum = a1+b1+carryon;
            if(sum == 0){
                sb.append(0);
                carryon = 0;
            }else if(sum == 1){
                sb.append(1);
                carryon = 0;
            }else if(sum >= 2){
                if(sum%2 == 0){
                    sb.append(0);
                    carryon = 1;
                }else{
                    sb.append(1);
                    carryon = 1;
                }

            }else{
                sb.append(0);
            }
            i--;
            j--;
        }
        if(carryon == 1){
            sb.append(1);
        }
        sb = sb.reverse();
        return sb.toString();
    }

    public static int convertCharToInt(char ch){
        int a = Integer.parseInt(String.valueOf(ch));
        return a;
    }

}
