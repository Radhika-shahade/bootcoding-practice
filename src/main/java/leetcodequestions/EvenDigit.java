package leetcodequestions;
// Find Numbers with Even Number of Digits
public class EvenDigit {

    public static int findEvenDigit(int[] num) {

        int result=0;
        for(int i=0;i<num.length;i++)
        {
            int digit=0;
            while(num[i]!=0)
            {

              digit++;
                num[i]=num[i]/10;
            }
            if(digit%2==0)
            {
                result++;
            }
        }
        System.out.println(result);
return result;
    }
    public static void main(String[] args) {
        int arr[]={121,345,2,6,789};
        EvenDigit result= new EvenDigit();
        result.findEvenDigit(arr);
    }

}
