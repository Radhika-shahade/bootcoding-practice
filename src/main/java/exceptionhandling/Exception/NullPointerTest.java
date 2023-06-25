package exceptionhandling.Exception;

public class NullPointerTest {
    ExceptionNullPointer exception; //by only creating reference variable we cannot call that class methods
                                    //because it does not get memory allocation hence exception occur as there is no object
                                  //  this reference variable contain null value
    public void m2()
    {
        exception.m1();
        System.out.println("m2 method is executing");
    }

    public static void main(String[] args) {
        NullPointerTest obj= new NullPointerTest();
        obj.m2();
    }


}
