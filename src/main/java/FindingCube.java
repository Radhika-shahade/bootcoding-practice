public class FindingCube {
    int cube;
    public void m1(int num)
    {
        for(int i=1;i<=num;i++)
        {
            cube=i*i*i;
            System.out.println("cube of number:"+i +  " is " +cube);
        }
    }

    public static void main(String[] args) {
        FindingCube fd= new FindingCube();
        fd.m1(5);

    }
}
