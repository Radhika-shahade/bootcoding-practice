package src.main.java.staticblock;

public class ClassStatic {
    public void m2()
    {
        System.out.println("m2 is executing");
    }
    static class Static{


        public static void m1()
        {
            System.out.println("m1 method name is executing");
        }
        public static void main(String[] args) {
            ClassStatic obj= new ClassStatic();
            obj.m2();

            m1();

        }
    }


}
