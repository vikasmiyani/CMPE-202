

public class GumballMachine implements IGumballMachine  {
 
    State soldOutState;
    State noCoinState;
    State hasCoinState;
    State soldState;
 
    State state = soldOutState;
    int count = 0;
    int numberOfGumballInSlot = 0;
    int amount = 0;
    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        noCoinState = new NoCoinState(this);
        hasCoinState = new HasCoinState(this);
        soldState = new SoldState(this);

        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noCoinState;
        } 
    }
 
    public void insertQuarter() {
        amount = amount + 25;
        state.insertCoin();
    }
 
    public void insertDime(){
        amount = amount + 10;  
         state.insertCoin();
    }
    
    public void insertNickel(){
        amount = amount + 5;
         state.insertCoin();
    }
    
    public boolean isGumballInSlot(){
        if(numberOfGumballInSlot > 0){
            return true;
        }   
        return false;
    }
    
    public void takeGumballFromSlot(){
        if(numberOfGumballInSlot > 0){
           System.out.println("Take "+numberOfGumballInSlot +" gumballs from slot");
           numberOfGumballInSlot = 0;
        }else{
            System.out.println("Sorry No gumballs in slot");
        }
        
    }
    
    
    public void ejectCoin() {
        state.ejectCoin();
    }
 
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void setState(State state) {
        this.state = state;
    }
 
    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
    }
 
    int getCount() {
        return count;
    }
    
    int getNumberOfGumballInSlot() {
        return numberOfGumballInSlot;
    }
    
    void setNumberOfGumballInSlot(int numberOfGumballInSlot){
        this.numberOfGumballInSlot = numberOfGumballInSlot;
    }
 
    int getAmount(){
        return amount;
    }
    
    void setAmount(int amount){
        this.amount = amount;
    }
    void refill(int count) {
        this.count = count;
        state = noCoinState;
    }

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoCoinState() {
        return noCoinState;
    }

    public State getHasCoinState() {
        return hasCoinState;
    }

    public State getSoldState() {
        return soldState;
    }
 
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004");
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }
}
