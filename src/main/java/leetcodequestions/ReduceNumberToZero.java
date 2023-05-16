package leetcodequestions;
// Find Numbers with Even Number of Digits


public class ReduceNumberToZero {
    public int numberOfSteps(int num) {
        int count = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num = num / 2;
                count++;
            }
            if (num % 2 != 0) {
                num = num - 1;
                count++;
            }

        }
        System.out.println(+count);
        return num;

    }

    public static void main(String[] args) {
        ReduceNumberToZero result= new  ReduceNumberToZero();
        result.numberOfSteps(8);

    }
}
