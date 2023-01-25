package Vijay.Week1;

public class StarPattern2 {
    public static void starPattern2() {
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("$ ");
            }
            System.out.println();
        }
    }
}
