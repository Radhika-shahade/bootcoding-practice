package leetcodequestions;

public class MoveZeros {
    public void moveElements(int[]arr)
    {
        int indexcount=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                arr[indexcount]=arr[i];
                indexcount++;
            }
        }
        while( indexcount<arr.length)
        {
            arr[indexcount++]=0;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }



    }
    public static void main(String[] args) {
        int a[]={5,6,0,7,0};
        MoveZeros result= new MoveZeros();
        result.moveElements(a);


    }

}
