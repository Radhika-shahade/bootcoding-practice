import javax.xml.transform.stream.StreamSource;

public class ArrayEvenElement {
    public static void main(String[] args) {
        int[]a={7, 22, 19, 44, 45, 65, 66};
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                System.out.println(+a[i]);
            }
        }
    }
}
