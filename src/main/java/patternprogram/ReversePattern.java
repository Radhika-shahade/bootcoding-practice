package patternprogram;

public class ReversePattern {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)        //12345
        {
            for(int j=1;j<=5;j++)
            {
                if((j>=1)&&(j<=6-i))
                {
                    System.out.print(j);
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
