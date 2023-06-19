package polymorphism.overloadingdrivecar;
//Drive Car (with distance, with number of members, quantity of stop)
public class CarService {
    private double distance;
    private int members;
    private int numberOfStop;
    public void drive(double distance)
    {
     this. distance= distance;
     members=2;
     numberOfStop=1;
    }
    public void drive(double distance, int members)
    {
        this.distance=distance;
        this.members=members;
        numberOfStop=3;
    }
    public void drive(double distance, int members, int stopCount)
    {
        this.distance=distance;
        this.members=members;
        this.numberOfStop=stopCount;
    }
    public  void print()
    {
        System.out.println(" distance covered by vehicle " +distance + " number of members are " + members+ " stops taken by vehicle are "+ numberOfStop );
    }



}
