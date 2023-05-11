import java.util.Scanner;

public class ReduceNumberToZero {
    public static void main(String[] args) {
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        while (num > 0) {

            if (num % 2 == 0) {
                num = num / 2;
                System.out.println(+num);
                count++;
            }
            if (num % 2 != 0) {
                num = num - 1;
                System.out.println(+num);
                count++;
            }

            }
        System.out.println("number of steps are:" + count);



    }
    }

