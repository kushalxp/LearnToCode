package Vishal.Week1;

public class SquareRoot {

    public int mySqrt(int x) {

        long start = 1 ;
        long end = x ;
        long mid = (start + end) / 2;
        while(start <= end) {
            if(mid * mid == x) {
                break;
            }else if (mid * mid > x) {
                end = mid - 1;
            }else {
                start = mid + 1;
            }
            mid = (start + end) / 2;
        }
        return (int)mid;

    }
}
