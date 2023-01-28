package Shweta.Week2;

public class Array {
    public static void main(String[] args) {
        int[] a = new int[10];
        printTableOfTwo(a);
        tableOf10(a);
        reverseMultiplicationOf2(a);
        seriesOfDoubling(a);
    }

    private static void printTableOfTwo(int[] a) {
        int i = 0;
        for (i = 1; i <= a.length; i++) {
            a[i - 1] = i * 2;
            System.out.print(a[i - 1]+ " ");
        }
        System.out.println();
    }

    public static void tableOf10(int[] a) {
        for(int i=0; i<5; i++){
            int total = 2;
            total = total * 5 * i;
            System.out.print(total+" ");
        }
        System.out.println();
    }

    public static void reverseMultiplicationOf2(int[] a) {
        int i = 0;
        int count = 2;
        a[0] = 2;
        for (i = a.length-1; i > 0; i--) {
            a[i] = a[i - 1] * 2;
            System.out.print(a[i-1]+" ");
        }
        System.out.println();
    }

    public static void seriesOfDoubling(int[] a){
        int count = 2;
        a[0] = 2;
        for (int i = 1; i <= a.length-1; i++) {
            a[i] = a[i - 1] * 2;
            System.out.print(a[i]+ " ");
        }
        System.out.println();
    }

}
