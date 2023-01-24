package Vishal.Week1;

public class StarPattern {

    public void starPattern1(){

        for (int i=0; i<7; i++)
        {
            for(int j=0; j<i; j++)
            {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public void starPattern2(){

        for (int i=7; i>0; i--)
        {
            for(int j=i; j>0; j--)
            {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public void santraPattern(){

        for(int i=7; i>0; i--)
        {
            for(int k=1; k<i; k++)
            {
                System.out.println(" ");
            }
            for(int j=7;j>i; j--)
            {
                System.out.println("*" + " ");
            }
            System.out.println();
        }
    }

    public void ultaSantraPattern(){

        for(int i=1; i<7;i++)
        {
            for(int k=1; k<i; k++)
            {
                System.out.println(" ");
            }
            for(int j=7;j>i; j--)
            {
                System.out.println("*" + " ");
            }
            System.out.println();
        }
    }


}
