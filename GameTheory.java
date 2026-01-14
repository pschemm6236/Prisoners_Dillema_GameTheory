
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
        while(roundCounter < round){
            System.out.println("Round #: " + roundCounter);
            beginRound(p1, p2);
        }
        

        
    }

    /**
     * Contains logic for different strategies in game
     * ex: tit for tat going against always defect 
     */
    public Player beginRound(Strategy p1, Strategy p2) {

        System.out.println("");
        
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

