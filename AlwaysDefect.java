public class AlwaysDefect extends Strategy {

    public AlwaysDefect() {
        super();
    }

    public AlwaysDefect(String name, int cointTotal, int totalMovesMade, int strategy, Boolean[] roundDecision) {
        super(name, cointTotal, totalMovesMade, strategy, roundDecision);
    }

    @Override
    public boolean decideMove(int roundNumber, Strategy opponent) {
        return false; //always defect
    }
    
}
