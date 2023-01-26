package Vijay.Week1;

public class InvertedPyramid {
    public static void invertedPyramid() {
        int point = 5;
        for (int i = 0; i < point; i++) {
            for (int j = 5; j > (point - i); j--) {
                System.out.print("  ");
            }
            for (int j = 5; j > i; j--) {
                System.out.print("# ");
            }
            for (int j = 4; j > i; j--) {
                System.out.print("# ");
            }
            for (int j = 5; j > (point - i); j--) {
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
