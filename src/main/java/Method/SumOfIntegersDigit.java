package Method;

public class SumOfIntegersDigit {
    public int FindingSum(int num) {

        int temp=0;
        while(num>0) {
            int res = num % 10;
            temp=temp+res;
            num = num / 10;
        }
        System.out.println(temp);

        return temp;
    }

    public static void main(String[] args) {
        SumOfIntegersDigit result= new SumOfIntegersDigit();
        result.FindingSum(2587);



    }
}
