package src.main.java.recursion;

public class TraverseArray {
 public static void traverseArray(int arr[],int i)
 {
     if(i==arr.length)
     {
         return;
     }
     System.out.println(arr[i]);
     traverseArray(arr,++i);

 }

    public static void main(String[] args) {
     int a[]={2,3,4,5};
        traverseArray(a,0);
    }

}
