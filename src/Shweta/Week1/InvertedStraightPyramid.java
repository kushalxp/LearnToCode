package Shweta.Week1;

public class InvertedStraightPyramid {
    public static void pyramid() {
        int n = 6;
        for (int i = 0; i < n; i++) {
            for (int k = 0; k <= i - 1; k++) {
                System.out.print(" ");
            }
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int k = i; k < n - 1; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
