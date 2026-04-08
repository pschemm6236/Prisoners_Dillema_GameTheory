public class GrimTrigger extends Strategy{

    //create field/flag for if opponent has ever defected 
    public boolean everDefected = false; 

    //no arg constructor 
    public GrimTrigger(){
        super(); 
    }

    //full constructor 
    public GrimTrigger(String name, int coinTotal, int totalMovesMade, int strategy, Boolean[] roundDecision){
        super(name, coinTotal, totalMovesMade, strategy, roundDecision);
    }

    //if opponent defects just once, then always defect going forward, 
    @Override
    public boolean decideMove(int round, Strategy opponent){

        if(round == 1){
            return true; 
        }
        else if(everDefected == true)
            return false; 

        else{
            //get oppopnents last move
            boolean lastMove = opponent.getMove(round - 1);

            if(lastMove == false){
                //set everDefected to true
                everDefected = true; 
                return false; 
            }


            else{
                return true;
            }

            
        }

    }
}
