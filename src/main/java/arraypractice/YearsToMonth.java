package arraypractice;

import java.time.Year;

public class YearsToMonth {
    public static void main(String[] args) {
        double years[]={1, 2.5, 3.2, 10.5, 15};

        for (int i=0;i<years.length;i++)
        {
            double result =years[i]*12;
            System.out.println(+result+ " months");
        }



    }
}
