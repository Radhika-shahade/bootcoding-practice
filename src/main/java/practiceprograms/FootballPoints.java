package practiceprograms;

public class FootballPoints {
    public void m1(int wins, int draws,int losses)
    {
int points= wins*3+draws*1+losses*0;
        System.out.println(+points);
    }

    public static void main(String[] args) {
        FootballPoints obj=new FootballPoints();
        obj.m1(3,4,2);
    }
}
