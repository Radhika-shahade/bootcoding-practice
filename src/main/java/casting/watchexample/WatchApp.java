package casting.watchexample;

public class WatchApp {
    public static void main(String[] args) {
        Watch watch= new Watch();
        WristWatch wristwatch= new WristWatch();
        WallWatch wallwatch = new WallWatch();

        //object of wristwatch and assign to watch
        System.out.println("Child is cast to parent");
        Watch res=(Watch)wristwatch;
        res.dialOfWatch();

        //Object of Wall watch and assign to watch
        System.out.println("Child is cast to parent"); //it is en ex of static binding
        //reference variable type determine which method should execute(reference variable is of parent class )
        Watch wc=(Watch)wallwatch;
        wc.dialOfWatch();

//        Object of Wrist Watch assign to Wall watch
//       WallWatch ww=(WallWatch)wristwatch; //invalid becoz there is no relation between the classes

    }


}
