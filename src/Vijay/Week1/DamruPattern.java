package Vijay.Week1;

public class DamruPattern {
    public static void damruPattern() {
        int point = 5;
        for (int i = 0; i < point; i++) {
            for (int j = point; j > (point - i);  j--) {
                System.out.print("  ");
            }
            for (int j = 0; j < (point - i); j++) {
                System.out.print("# ");
            }
            for (int j = 1; j < (point - i); j++) {
                System.out.print("# ");
            }
            for (int j = point; j > (point - i); j--) {
                System.out.print("  ");
            }
            System.out.println();
        }

        for (int i = 0; i < (point - 1); i++) {
            for (int j = 2; j < (point - i); j++) {
                System.out.print("  ");
            }
            for (int j = 7; j >= (point - i); j--) {
                System.out.print("# ");
            }
            for (int j = 5; j > (point - i); j--) {
                System.out.print("# ");
            }
            for (int j = 7; j >= (point - i); j--) {
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
