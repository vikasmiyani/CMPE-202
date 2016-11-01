

public class SoldState implements State {
 
    GumballMachine gumballMachine;
 
    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
       
    public void insertCoin() {
        System.out.println("Please wait, we're already giving you a gumball");
    }
 
    public void ejectCoin() {
        System.out.println("change amount :"+gumballMachine.getAmount());
    }
 
    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball!");
    }
 
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            if(gumballMachine.getAmount() > 50){
              gumballMachine.setAmount(gumballMachine.getAmount()-50);
              gumballMachine.ejectCoin();
            }else{
              gumballMachine.setAmount(0);
            }
            gumballMachine.setNumberOfGumballInSlot(gumballMachine.getNumberOfGumballInSlot()+1);
            gumballMachine.setState(gumballMachine.getNoCoinState());
        } else {
            System.out.println("Oops, out of gumballs!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
 
    public String toString() {
        return "dispensing a gumball";
    }
}


