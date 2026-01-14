import java.util.Map;



public class Strategy extends Player{

    //use a hashmap to store key, value pair where key is the round number
    //and the value is the boolean value of whether to defect or cooperate with 
    //other player in round 
    private int strategy; 
    private Map<Integer, Boolean> mutableMap; //integer indicates the round number, boolean indicates whether to cooperate or defect 


    //no arg
    public Strategy(){

    }

    //partial constructor 
    public Strategy (String name, int cointTotal, int totalMovesMade, int strategy){
        super(name, cointTotal, totalMovesMade); //inherit parent player's attributes 
        this.strategy = strategy; 
        //this.mutableMap = new HashMap<>(); //consider having a fixed size to map 
    }

    //generate getters and setters 

    public int getStrategy() {
        return strategy;
    }

    public void setStrategy(int strategy) {
        this.strategy = strategy;
    }

    public Map<Integer, Boolean> getMutableMap() {
        return mutableMap;
    }

    public void setMutableMap(Map<Integer, Boolean> mutableMap) {
        this.mutableMap = mutableMap;
    }

}