public class AlwaysCooperate extends Strategy {

    public AlwaysCooperate() {
        super();
    }

    public AlwaysCooperate(String name, int cointTotal, int totalMovesMade, int strategy, Boolean[] roundDecision) {
        super(name, cointTotal, totalMovesMade, strategy, roundDecision);
    }

    @Override
    public boolean decideMove(int roundNumber, Strategy opponent) {
        return true; //always cooperate
    }

}