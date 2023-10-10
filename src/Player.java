public class Player {

    String name;
    int age;
    int points;
    int fga;
    int fgm;
    int tpa;
    int tpm;
    double minutes;
    int fta;
    int ftm;
    int assists;
    int rebounds;
    boolean light_injury;
    boolean medium_injury;
    boolean high_injury;
    double height;

    public Player(int a, int p, int fa, int fm, int ta, int tp,
    int ftaa, int ftmm, int as, int reb,
    boolean li, boolean mi, boolean hi, int hei){

        age = a;
        points = p;
        fga = fa;
        fgm = fm;
        tpa = ta;
        tpm = tp;
        fta = ftaa;
        ftm = ftmm;
        assists = as;
        rebounds = reb;
        light_injury = li;
        medium_injury = mi;
        high_injury = hi;
        height = hei;
    }
}
