package arraypractice;
// WAP to print element of an array which are divisible by 3 & 5

public class DivisibleBy {
    public void divisibleBy(int arr[]) {
        int num=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                num=arr[i]/3;
                System.out.println(+arr[i]+"  is divisible by 3 "+ "and quotient is  " + num);
            }
            if (arr[i] % 5 == 0) {
                num=arr[i]/5;
                System.out.println(+ arr[i]+"  is divisible by 5 " + "and quotient is  " +num);
            }
        }
    }

    public static void main(String[] args) {
        DivisibleBy result= new DivisibleBy();
        int arr[]={35,60,29,45,66,79};
        result.divisibleBy(arr);
    }


}
