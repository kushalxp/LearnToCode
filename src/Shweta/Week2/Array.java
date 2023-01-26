package Shweta.Week2;

public class Array {

    public static void main(String[] args) {
        int[] a = new int[10];
//        printArraymultiple(a);
        printArraymultiple21(a);
    }

    private static void printArraymultiple(int[] a) {
        int i = 0;
        for (i = 1; i <= a.length; i++) {
            a[i - 1] = i * 2;
            System.out.println(a[i - 1]);
        }
    }

    public static void printArraymultiple21(int[] a) {
//        int i = 0;
//
//        int count = 2;
//        a[0] = 2;
//        for (i = a.length; i >= 1; i--) {
//            a[i] = a[i - 1] * 2;
//            System.out.print(a[i-1]+" ");
//        }

        for(int i=0; i<5; i++){
            int total = 2;
            total = total * 5 * i;
            System.out.print(total+" ");
        }



    }

        public static void printArraymultiple212(int[] a){

            int count = 2;
            a[0] = 2;
            for (int i = 1; i <= a.length; i++) {
                a[i] = a[i - 1] * 2;
                System.out.println(a[i]);
            }
        }






}
