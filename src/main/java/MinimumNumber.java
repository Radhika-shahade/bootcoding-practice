import java.util.Scanner;

public class MinimumNumber {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the length of array");
        int length= sc.nextInt();
        System.out.println("Enter the number:");
        int num[]=new int[length];
        for(int i=0;i<num.length;i++){
            num [i]=sc.nextInt();
            for(int j=i+1; j<num.length;j++)
            {
                if(num[i]>num[j])
                {
                    int a= num[j];
                    num[j]=num[i];
                    num[i]=a;


                }
            }
            System.out.println(num[i]);
        }



    }
}
