package usingrandommethod;

import java.util.Random;

public class Match {
    private String teamname;
    private String groundname;
    private int runs;
    private int over;
    static int maxover=50;
    static int minover=20;
    static int max = 200;
    static int min= 50;
    public Match(String teamname, int runs,String groundname, int over){

            this.teamname=teamname;
            this.runs=runs;
            this.groundname=groundname;
            this.over=over;

    }


           static Random random= new Random();
    public static int randomOverGenerator()
    {
        int over=random.nextInt(maxover-minover);
        int newover= minover+over;
        return newover;
    }
    public static int randomRunsGenerator()
    {
        int score = random.nextInt(max-min);
        int run = min+ score;
//        System.out.println(" runs are = " + run);
        return run;
    }

    public String getTeamname() {
        return teamname;
    }

    public void setTeamname(String teamname) {
        this.teamname = teamname;
    }

    public String getGroundname() {
        return groundname;
    }

    public void setGroundname(String groundname) {
        this.groundname = groundname;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;

    }

    public int getOver() {
        return over;
    }

    public void setOver(int over) {
        this.over = over;
    }

    @Override
    public String toString() {
        return "Match{" +
                "teamname='" + teamname + '\'' +
                ", groundname='" + groundname + '\'' +
                ", runs=" + runs +
                ", over=" + over +
                '}';
    }


    public static void main(String[] args) {
        Match[] matchvariavble = new Match[2];
        matchvariavble[0] = new Match("MI", randomRunsGenerator(), "wankhede",randomOverGenerator());
        matchvariavble[1] = new Match("CSK", randomRunsGenerator(), "VCA",randomOverGenerator());

        for (int i = 0; i < 2; i++) {
            System.out.println(matchvariavble[i]);
        }
        if (matchvariavble[0].getRuns() > matchvariavble[1].getRuns())
        {
            System.out.println("MI WINS");
        }
        else {
            System.out.println("CSK WINS");
        }

    }

}
