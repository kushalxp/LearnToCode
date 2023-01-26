package Vijay.Week1;

public class PyramidPattern {
    public static void pyramidPattern() {
        int points = 5;
        for (int i = points; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 5; j >= i; j--) {
                System.out.print("$ ");
            }
            for (int j = 5; j > i; j--) {
                System.out.print("$ ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
