
import java.util.Random;


/**
 * PRISONER'S DILLEMA GAME THEORY PROBLEM
 * based on this video: https://www.youtube.com/watch?v=mScpHTIi-kM
 * 
 * ->a banker is organizing a contest between two players. each player in the 
 * game has only 2 options: cooperate or defect 
 * 
 * if both players cooperate then they both get 3 coins, if one players cooperates 
 * and the other defects then one gets five coins (defector) and one gets none (cooperator)
 * and lastly if both defect then each player only gets 1 coin 
 * 
 * Goal: to get as many coins as you can 
 * 
 * Rationally, it makes sense to always defect, worst case receiving 1 coin or best case receiving 5 
 * Always cooperating means best case gets 3 coins and worst case receiving none  
 */

public class GameTheory {

    //fields 
    private int round; //have the number of rounds range from 10 - 30 randomly
    private Player gameWinner;
    
    
    //no arg contructor 
    public GameTheory(){ }

    //full contructor 
    public GameTheory(int round, Player gameWinner){
        this.round = round; 
        this.gameWinner = gameWinner; 
    }

    public void beginGame(Strategy p1, Strategy p2) {

        //randomly determine how many rounds are in the game from 10-30
        Random rand = new Random();
        int numRounds = rand.nextInt(30 - 10 + 1) + 10;
        setRound(numRounds);

        System.out.println("Number of rounds for this game is " + getRound()); 

        int roundCounter = 1;
        while(roundCounter <= round){
            System.out.println("Round #: " + roundCounter);
            beginRound(p1, p2, roundCounter);
            roundCounter++;
        }
        
        //determine winner
        System.out.println("\nFinal Scores:");
        System.out.println(p1.getName() + ": " + p1.getCoinTotal() + " coins");
        System.out.println(p2.getName() + ": " + p2.getCoinTotal() + " coins");
        
        if (p1.getCoinTotal() > p2.getCoinTotal()) {
            setGameWinner(p1);
            System.out.println(p1.getName() + " wins!");
        } else if (p2.getCoinTotal() > p1.getCoinTotal()) {
            setGameWinner(p2);
            System.out.println(p2.getName() + " wins!");
        } else {
            System.out.println("It's a tie!");
        }
        

        
    }

    /**
     * Contains logic for different strategies in game
     * ex: tit for tat going against always defect 
     */
    public Player beginRound(Strategy p1, Strategy p2, int roundNumber) {

        System.out.println("");
        
        boolean p1Move = p1.decideMove(roundNumber, p2);
        boolean p2Move = p2.decideMove(roundNumber, p1);
        
        //store decisions
        p1.getRoundDecision()[roundNumber - 1] = p1Move;
        p2.getRoundDecision()[roundNumber - 1] = p2Move;
        
        //calculate points
        int p1Points = 0;
        int p2Points = 0;
        
        if (p1Move && p2Move) { // both cooperate
            p1Points = 3;
            p2Points = 3;
        } else if (p1Move && !p2Move) { // p1 coop, p2 def
            p1Points = 0;
            p2Points = 5;
        } else if (!p1Move && p2Move) { // p1 def, p2 coop
            p1Points = 5;
            p2Points = 0;
        } else { // both def
            p1Points = 1;
            p2Points = 1;
        }
        
        //update totals
        p1.setCoinTotal(p1.getCoinTotal() + p1Points);
        p2.setCoinTotal(p2.getCoinTotal() + p2Points);
        p1.setTotalMovesMade(p1.getTotalMovesMade() + 1);
        p2.setTotalMovesMade(p2.getTotalMovesMade() + 1);
        
        System.out.println(p1.getName() + " chose " + (p1Move ? "cooperate" : "defect") + ", " + p2.getName() + " chose " + (p2Move ? "cooperate" : "defect"));
        System.out.println("Points: " + p1.getName() + " +" + p1Points + ", " + p2.getName() + " +" + p2Points);
        
        return null; //return the winner of the round 
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public Player getGameWinner() {
        return gameWinner;
    }

    public void setGameWinner(Player gameWinner) {
        this.gameWinner = gameWinner;
    }

   

}

