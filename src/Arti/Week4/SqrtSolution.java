package Arti.Week4;

public class SqrtSolution {
    public static void Sqrt(){
      int n=37;
      for (int i=1;i<=n/2;i++) {
          if (i * i == n) {
              System.out.println("sqrt is " + i);
              break;
          } else if (i * i > n) {
              System.out.println("sqrt is " + (i - 1));
              break;
          }

      }
    }
}
