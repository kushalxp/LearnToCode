package Arti.Week3;

public class EvenOddNo {

    public static void EvenOddNo() {
        //int flag=0;
        int n = 10;
        for (int i = 2; i <= n; i++) {
            if (n % 2 == 0) {
                System.out.println(n + " is even no");
                //flag=1;
                break;
            } else {
                System.out.println(n + " is odd no");
                break;
            }
        }

    }
}

