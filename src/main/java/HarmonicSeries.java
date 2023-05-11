public class HarmonicSeries {

    public static void main(String[]args)
    {
        int a= 5;
        double b=1.0;
        for(int i=a;i>0;i--)
        {
          System.out.println(b=b+(1.0/i))  ;

        }
        System.out.println("sum of series up to 5 terms is:"+b);
    }
}
