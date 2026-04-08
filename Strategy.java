
public abstract class Strategy extends Player{

    //use a boolean array to store decisions where index is the round number - 1
    //and the value is the boolean value of whether to defect or cooperate with 
    //other player in round 
    private int strategy; 
    private Boolean[] roundDecision; //indices indicates the round number - 1, boolean indicates whether to cooperate or defect 
    //true means cooperate and false means defect 


    //no arg
    public Strategy(){

    }

    //partial constructor 
    public Strategy (String name, int cointTotal, int totalMovesMade, int strategy, Boolean[] roundDecision){
        super(name, cointTotal, totalMovesMade); //inherit parent player's attributes 
        this.strategy = strategy; 
        this.roundDecision = roundDecision; //consider having a fixed size to map 
    }

    //abstract method to be implemented by each strategy class
    //takes in the round number and returns a boolean value indicating whether to cooperate or defect
    public abstract boolean decideMove(int roundNumber, Strategy opponent); 
    
    //method to get the move for a specific round (1-based)
    public boolean getMove(int roundNumber) {
        return roundDecision[roundNumber - 1];
    }
    
    //generate getters and setters 
    public int getStrategy() {
        return strategy;
    }

    public void setStrategy(int strategy) {
        this.strategy = strategy;
    }



    public Boolean[] getRoundDecision() {
        return roundDecision;
    }



    public void setRoundDecision(Boolean[] roundDecision) {
        this.roundDecision = roundDecision;
    }


}
