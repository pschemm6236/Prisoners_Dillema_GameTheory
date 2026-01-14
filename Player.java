public class Player{ //parent class that will have child class of strategy 

    //fields
    private String name; 
    private int coinTotal; 
    private int totalMovesMade; 
    //private Strategy strat; //generate getters and setters for strat
    

    //empty constructor 
    public Player()
    {

    }

    //full constructor 
    public Player(String name, int coinTotal, int totalMovesMade){
        this.name = name; 
        this.coinTotal = coinTotal; 
        this.totalMovesMade = totalMovesMade; 
    }

    @Override
    public String toString() {
        return "Player name: " + name + "; Total coins: " + coinTotal + "; Total moves made: " + totalMovesMade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCoinTotal() {
        return coinTotal;
    }

    public void setCoinTotal(int coinTotal) {
        this.coinTotal = coinTotal;
    }

    public int getTotalMovesMade() {
        return totalMovesMade;
    }

    public void setTotalMovesMade(int totalMovesMade) {
        this.totalMovesMade = totalMovesMade;
    }

    
    
}