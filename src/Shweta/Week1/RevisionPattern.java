package Shweta.Week1;

public class RevisionPattern {
    public static void main(String[] args){
        int n=5;

        System.out.println("BOX STAR");
        for(int row=0; row<n; row++){
            for (int col=0; col<n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("LEFT STAR");
        for(int row=0; row<n; row++){
            for (int col=0; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("INVERTED LEFT STAR");
        for(int row=0; row<n; row++){
            for (int col=row; col<n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("RIGHT STAR");
        for(int row=0; row<n; row++){
            for (int space=row; space<n-1; space++){
                System.out.print("  ");
            }
            for (int col=0; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("INVERTED RIGHT STAR");
        for(int row=0; row<n; row++){
            for (int space=0; space<row; space++){
                System.out.print("  ");
            }
            for (int col=row; col<n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("PYRAMID STAR");
        for(int row=0; row<n; row++){
            for (int space=row; space<n-1; space++){
                System.out.print(" ");
            }
            for (int col=0; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("INVERTED PYRAMID STAR");
        for(int row=0; row<n; row++){
            for (int space=0; space<row; space++){
                System.out.print(" ");
            }
            for (int col=row; col<n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("DAMRU STAR");
        for(int row=0; row<n*2; row++){
            if(row < n) {
                for (int space = 0; space < row; space++) {
                    System.out.print(" ");
                }
                for (int col=row; col<n; col++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            if(row-1 > n-1){
                for (int space=row-n; space<n-1; space++){
                    System.out.print(" ");
                }
                for (int col=0; col<=row-n; col++){
                    System.out.print("* ");
                }
                System.out.println();
            }

        }

    }
}
