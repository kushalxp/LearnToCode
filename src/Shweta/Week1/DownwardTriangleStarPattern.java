package Shweta.Week1;

public class DownwardTriangleStarPattern {
    public static void printDownwardTriangleStarPattern() {
        int n = 7;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
