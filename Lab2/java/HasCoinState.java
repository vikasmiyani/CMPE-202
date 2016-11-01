

import java.util.Random;

public class HasCoinState implements State {
    GumballMachine gumballMachine;
 
    public HasCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
  
    public void insertCoin() {
        System.out.println("Total amount :"+gumballMachine.getAmount());
    }
 
    public void ejectCoin() {
        System.out.println("Coin returned");
        gumballMachine.setAmount(0);
        gumballMachine.setState(gumballMachine.getNoCoinState());
    }
 
    public void turnCrank() {
        System.out.println("You turned...");
        if(gumballMachine.getAmount() < 50){
          System.out.println("Amount is less than 50 cents");
        }else if(gumballMachine.getAmount() >= 50){
          System.out.println("Total amount :"+gumballMachine.getAmount());
         gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
        gumballMachine.setState(gumballMachine.getNoCoinState());
    }
 
    public String toString() {
        return "waiting for turn of crank";
    }
}
