
public class Player {

    /**
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

    int steals;

    int blocks;

    int fouls;

    int to;

    double mins;
    int assists;
    int offensive_rebounds;

    int def_rebounds;
    double height;

    double PER;

    double fg_percent;

    double tp_percent;

    double underdog;

    public Player(String s, int a, int p, int fa, int fm, int ta, int tp,
    int ftaa, int ftmm, int steals, int blocks, int fouls, int to, double mins,
                  int as, int oreb, int dreb, int hei){

        name = s;
        age = a;
        points = p;
        fga = fa;
        fgm = fm;
        tpa = ta;
        tpm = tp;
        fta = ftaa;
        ftm = ftmm;
        this.steals = steals;
        this.blocks = blocks;
        this.fouls = fouls;
        this.to = to;
        mins = this.mins;
        assists = as;
        offensive_rebounds = oreb;
        def_rebounds = dreb;
        height = hei;

        PER = (fgm*85.910 + steals*53.897 + tpm*51.757 + ftm*46.845
                + blocks*39.19 + offensive_rebounds*39.190 + assists * 34.677
                + def_rebounds*14.707 - fouls*17.174 - (fta - ftm)*20.091 - (fga - fgm)*39.190
                - to*53.897) * (1/mins);

        fg_percent = fgm/fga;

        tp_percent = tpm/tpa;


        if(age >= 34 || age <= 22){

            underdog = (tpm*2 + fgm + 0.7*assists -
                    0.1*mins + 3*steals + 2*blocks - fouls) + 5;
        }
        else{

            underdog = tpm*2 + fgm + 0.7*assists - 0.1*mins + 3*steals + 2*blocks - fouls;
        }
    }
     */

    String first_name;
    String last_name;
    int gp;
    double mpg;
    double ppg;
    double rpg;
    double apg;
    double spg;
    double bpg;
    double tpg;
    double fgm;
    double fga;
    double fgp;
    double tpm;
    double tpa;
    double ftp;
    int min;
    int pts;
    int reb;
    int ast;
    int stl;
    int blk;
    int tov;
    int plus_minus;

    double underdog;
    double defensive_effort;
    double tp_affinity;
    double longevity;



    public Player(String first_name, String last_name, int gp, double mpg, double ppg,
                  double rpg, double apg, double spg, double bpg, double tpg, double fgm,
                  double fga, double fgp, double ftp, int min, int pts, int reb, int ast, int stl,
                  int blk, int tov, int plus_minus){

        this.first_name = first_name;
        this.last_name = last_name;
        this.gp = gp;
        this.mpg = mpg;
        this.ppg = ppg;
        this.rpg = rpg;
        this.apg = apg;
        this.spg = spg;
        this.bpg = bpg;
        this.tpg = tpg;
        this.fgm = fgm;
        this.fga = fga;
        this.fgp = fgp;
        this.ftp = ftp;
        this.min = min;
        this.pts = pts;
        this.reb = reb;
        this.ast = ast;
        this.stl = stl;
        this.blk = blk;
        this.tov = tov;
        this.plus_minus = plus_minus;

        underdog = (4*ppg + rpg + apg + 1.5*spg + 2.5*bpg)/mpg;

        defensive_effort = (rpg + 1.5*bpg + 2*spg)/(fga);

        tp_affinity = (2*tpa - fga)/mpg;

        longevity = min + 100*(ppg-20) + (0.5)*(ast + blk + stl) - tov;

    }


}
