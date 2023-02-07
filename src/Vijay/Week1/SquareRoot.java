package Vijay.Week1;

public class SquareRoot {
    public int squareRoot(int x) {
        long root = 1;
        if(x == 0 || x == 1)
            return x;
        else {
            for(long i = 2; (i * i) <= x; i++) {
                root = i;
            }
        }
        return (int)root;
    }
}
