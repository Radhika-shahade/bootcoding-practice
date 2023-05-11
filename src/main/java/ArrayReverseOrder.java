public class ArrayReverseOrder {
    public static void main(String[] args) {
        int[]ages=new int[5];
        int n= ages.length;
        for(int i=n-1; i>=0; i--)
        {
            System.out.println("Array Element " + ages[i]);
        }
    }

}
