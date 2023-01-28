package Arti.Week3;

// import javax.swing.plaf.synth.SynthDesktopIconUI;

public class StarPattern {

    public static void DiamondShapePattern(){ //kiteshape

        for(int i=1; i<=3 ;i++) //row
        {
            for (int j = 3; j >= i; j--) // 1st blank right downward triangle
            {
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++) // 1st right triangle
            {
                System.out.print("*");
            }
            for (int k=2; k<=i; k++) // 1st right triangle
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1; i<=2 ;i++) //row
        {
            for (int j = 0; j <= i; j++) // 1st blank right triangle
            {
                System.out.print(" ");
            }
            for (int k=2; k>=i; k--) // 1st right triangle
            {
                System.out.print("*");
            }
            for (int k=2; k>=i+1; k--) // 1st right triangle
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
}
