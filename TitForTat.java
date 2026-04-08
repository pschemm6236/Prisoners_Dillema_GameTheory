public class TitForTat extends Strategy {

    public TitForTat(){
        super();
    }

    public TitForTat(String name, int cointTotal, int totalMovesMade, int strategy, Boolean[] roundDecision){
        super(name, cointTotal, totalMovesMade, strategy, roundDecision);
    }

    @Override
    public boolean decideMove(int roundNumber, Strategy opponent) {
        if(roundNumber == 1) {
            return true; //always cooperate on first round 
        }
        else{
            //decide move based on whatever the last move of the opponent was 
            boolean move = opponent.getMove(roundNumber - 1);
            
            //if true, then cooperate for this round
            if(move == true){
                return true; 
            }
            else{
                return false; 
            }
        }
    }

}