package src.main.java.patternprogram;

public class PyramidPattern {
    public static void main(String[] args) {
        for(int i=0;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++)
            {
                System.out.print(" *");
            }
            System.out.println("");
        }
    }
}
