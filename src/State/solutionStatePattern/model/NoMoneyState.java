package State.solutionStatePattern.model;

import State.solutionStatePattern.State;

public class NoMoneyState implements State {

    SodaVendingMachine sodaVendingMachine;

    public NoMoneyState(SodaVendingMachine sodaVendingMachine) {
        this.sodaVendingMachine = sodaVendingMachine;
    }

    @Override
    public void insertMoney() {
        System.out.println("You inserted a dollar");
        sodaVendingMachine.setState(sodaVendingMachine.getHasMoneyState());
    }

    @Override
    public void ejectMoney() {
        System.out.println("You haven't inserted a dollar");
    }

    @Override
    public void select() {
        System.out.println("You selected, but there is no money!");
    }

    @Override
    public void dispense() {
        System.out.println("Pay me first!");
    }

    @Override
    public String toString() {
        return "waiting for a dollar...";
    }
}
