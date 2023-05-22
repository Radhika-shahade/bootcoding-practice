package Method;

public class FindSmallestNumber {
    public static void findingSmallestNumber(int a, int b, int c) {
        if ((a < b) && (a < c))
            {
                System.out.println("smallest number is " + a);
            }
            if((b<a)&&(b<c))
            {
                System.out.println("smallest number is "+ b);
            }
            if((c<a)&&(c<b))
            {
                System.out.println("smallest number is "+ c);
            }



    }

    public static void main(String[] args) {
        findingSmallestNumber(63,23,43);

    }
}


