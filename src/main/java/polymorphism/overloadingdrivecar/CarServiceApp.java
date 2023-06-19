package polymorphism.overloadingdrivecar;

public class CarServiceApp {
    public static void main(String[] args) {
        CarService cs= new CarService();
        cs.drive(300);
        cs.print();
        cs.drive(150,2);
        cs.print();
        cs.drive(200,4,0);
        cs.print();
    }
}
