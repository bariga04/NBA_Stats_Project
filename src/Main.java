import java.util.Scanner;
import java.util.ArrayList; // import just the ArrayList class

public class Main {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        ArrayList<Player> playerList = new ArrayList<Player>();


        //ArrayList<Player> playerList = new ArrayList<Player>();

        /**
         * Code to Scan Player Stats In
         */

        System.out.println("Program: NBA Stat Analysis");
        System.out.println("Author: Bhargavram Ariga\n");

        System.out.println("Welcome User! The following programs computes different stats I have created" +
                "to quantify a player's: defensive effort, how much of an \"underdog\" they are (essentially the" +
                "the relative impact they've had based on the number of minutes they were given), " +
                "their tendency to shoot three pointers, and finally their \"longevity\" which is essentially" +
                "their relative performance based on how long they've been playing. These four stats labeled:" +
                "\"defensive effort\", \"underdog\", \"three point affinity\" and \"longevity\" respectively" +
                "will be computed for different players you input into the program. To input a player simply" +
                "type their first and last name and copy paste their career stats from statmuse.com. Do all " +
                "of this on the same line in the terminal. On the " + "statmuse website, simpy highlight the row " +
                "with their career stats and copy paste it into " + "the terminal. If choose to give more than " +
                "one player, the program will tell you the best " + "player in specefic categories including the " +
                "afformentioned stats");


        String start;

        while(!start.equals("stop")){

            System.out.println("\nType in the player and their stats. If you want to exit the program type " +
                    "\"stop\"");
            System.out.println("\n");

            start = scan.next();

            if(start.toLowerCase().equals("stop")){

                break;
            }

            ArrayPlayer

        }

        /**
         * methods for advanced analytics
         */
      ArrayList<>


        /**
         * code where user can type in player name and program returns ranking for each category
         */


    }
}