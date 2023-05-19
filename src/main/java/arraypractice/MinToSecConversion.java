package arraypractice;

public class MinToSecConversion {
    public static void main(String[] args) {
        int minArray[]={3, 5, 10, 23, 60};
        for(int i=0;i<minArray.length;i++)
        {
            int result=0;
           result = minArray[i]*60;
            System.out.println(+minArray[i]+" is converted into seconds "+result);
        }

    }
}
