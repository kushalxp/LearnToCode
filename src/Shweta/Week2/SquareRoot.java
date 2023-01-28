package Shweta.Week2;

/**
 * Given a non-negative integer x, return the square root of x rounded down to the nearest integer.
 * The returned integer should be non-negative as well.
 * You must not use any built-in exponent function or operator.
 * For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 *
 * Input: x = 4
 * Output: 2
 * Explanation: The square root of 4 is 2, so we return 2.
 *
 * Input: x = 8
 * Output: 2
 * Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
 *
 * Constraints:
 * 0 <= x <= 231 - 1
 */
public class SquareRoot {

    public static void main(String[] args) {
        int x = 4;
        System.out.println(mySqrt(x));
    }

    public static int mySqrt(int x) {
        // Long[] arrSquare = new Long[x];
        // int i=0;
        long prevSq=0;
        long sq=0;

        if(x==0){
            return 0;
        }

        if(x<=2){
            return 1;
        }

        for(int i=3; i<x; i++){
            // [0, 1, 4, 9, 16, 25, 36, 49, ...]
            prevSq = Long.valueOf(i)*Long.valueOf(i);
            // eg: 8, 8>9 then return array index
            if(prevSq == x){
                return i;
            }
            else if(prevSq > x){
                return i-1;
            }
        }
        return 1;
    }
}
