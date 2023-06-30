package collections.arraylist.watch;


import java.util.ArrayList;

public class WatchApp {

    public static void main(String[] args) {
        ArrayList<Watch>obj= new ArrayList<>();
     obj.add(0,new Watch("Titan"));
     obj.add(1,new WallWatch("Sonata ",4000));
     obj.add(2,new WristWatch("MI ","circular"));
     for(int i=0;i<obj.size();i++)
     {
        obj.get(i).display();
     }
    }
}
