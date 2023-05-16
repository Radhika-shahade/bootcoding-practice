package leetcodequestions;

public class FindNumberWithEvenNumberOfDigits {
    public static void main(String[] args) {
        int[] nums={12,345,2,6,7896};
        int res = findNumbers(nums);
        System.out.println(res);
    }

    public static int findNumbers(int[] nums) {
        int count=0;
        for (int n : nums) {
            int digit=0;
            while (n!=0)
            {
                digit++;
                n=n/10;
            }
            if (digit%2==0)
            {
                count++;
            }
        }
        return count;
    }
}
