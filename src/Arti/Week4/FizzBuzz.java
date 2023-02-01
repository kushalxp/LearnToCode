package Arti.Week4;

import jdk.nashorn.internal.ir.ContinueNode;

import java.util.Scanner;

public class FizzBuzz {

    public static void FizzBuzz() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no");
        int n = sc.nextInt();

        //for (int i=0;i<=n;i++)
        //{
        if (n % 3 == 0 || n % 5 == 0)
            {
                System.out.println("FizzBuzz");
            } else if (n % 3 == 0) {
                System.out.println("Fizz");
                //return;
            } else if ((n % 5 == 0)) {
                System.out.print("Buzz");
                //return;
            } else {
                System.out.print(+n);
            }

    }

}