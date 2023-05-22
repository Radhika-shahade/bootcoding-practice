package Method;

public class FindingAverage {
 public void computingAverage(int a,int b,int c)
 {
   int average= (a+b+c)/3;
     System.out.println(" Average of three number is " +average);
 }

    public static void main(String[] args) {
        FindingAverage result= new FindingAverage();
        result.computingAverage(25,45,65);

    }

}
