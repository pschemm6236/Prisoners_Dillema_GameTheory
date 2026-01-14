
import java.util.Scanner;

public class GTDriver{

    public static void main(String[] args){

        //initialize menu for beginning a game 
        menu();
        gameLoop();

    }

    public static void menu(){

        System.out.println("\n*--WELCOME TO THE GAMETHEORY GAME--*");
        System.out.println("Menu options:\n1.) Debriefing on game theory program \n2.) Begin prisoners dillema game \n3.) Exit");
        System.out.println("\nPlease enter a number 1-3: ");

    }

    public static void gameLoop(){

        Scanner scan = new Scanner(System.in);

        boolean loop = true; 

        while (loop) {
            
            int choice = scan.nextInt();

            if(choice == 1){
                debriefing();
                menu();
            }
            //else begin game 
            //ask for user to enter player name, then have them choose a strategy 
            //from the strategy menu 
            else if(choice == 2){
                GameTheory gt = new GameTheory();

                playerSetup();
                
            }
            else if(choice == 3){
                //user chooses option 3
                System.exit(0);
            }
            else{
                System.out.println("Error, please enter a number 1-3");
                menu();
            } 

        }
        
    }

    public static void debriefing() {
        System.out.println(
            "PRISONER'S DILEMMA GAME THEORY PROBLEM\n\n" +
            "Based on this video: https://www.youtube.com/watch?v=mScpHTIi-kM\n\n" +
            "A banker is organizing a contest between two players.\n" +
            "Each player in the game has only two options: cooperate or defect.\n\n" +
            "If both players cooperate, they each get 3 coins.\n" +
            "If one player cooperates and the other defects,\n" +
            "the defector gets 5 coins and the cooperator gets none.\n" +
            "If both players defect, each player gets only 1 coin.\n\n" +
            "Goal: Get as many coins as you can.\n\n" +
            "Rationally, it makes sense to always defect:\n" +
            "- Worst case: receive 1 coin\n" +
            "- Best case: receive 5 coins\n\n" +
            "Always cooperating:\n" +
            "- Best case: receive 3 coins\n" +
            "- Worst case: receive none.");
    }

    public static void playerSetup(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the name of player 1:");
        String p1Name = scan.nextLine();
        //Player p1 = new Player(p1Name, 0, 0); //initialize player 1 
        //System.out.println(p1.toString());

        System.out.println("Please enter the name of player 2:");
        String p2Name = scan.nextLine();
        //Player p2 = new Player(p2Name, 0, 0); //initialize player 2
        //System.out.println(p2.toString());

        strategySetupMenu();
        System.out.println("Please enter a number 1-4 for player 1:");
        int stratChoice1 = scan.nextInt();
        strategySetup(stratChoice1);

        strategySetupMenu();
        System.out.println("Please enter a number 1-4 for player 2:");
        int stratChoice2 = scan.nextInt();
        

        //create objects for players and their strategies 
        Strategy p1 = new Strategy(p1Name, 0, 0, stratChoice1);
        Strategy p2 = new Strategy(p1Name, 0, 0, stratChoice2);
        


    }

    public static void strategySetup(int choice){

        //IN ORDER FOR GAME TO BE EFFECTIVE, THE NUMBER OF ROUNDS PLAYED MUST BE 
        //AMBIGUOUS TO THE PLAYER

        //choice 1 always defect


    }

    public static void strategySetupMenu(){
        System.out.println("*--Player Strategy Setup Menu--*");

        System.out.println("1.) Always defect");
        System.out.println("2.) Always cooperate");
        System.out.println("3.) Tit for Tat (cooperate first move)");
        System.out.println("4.) Grim trigger (cooperates but no forgiveness)");
        //NEED to look into other strats, possibly involving AI & neural nests

    }

}//end class 