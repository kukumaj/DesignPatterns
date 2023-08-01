package State.solutionStatePattern.model;

import State.solutionStatePattern.State;

public class HasMoneyState implements State {

    SodaVendingMachine sodaVendingMachine;

    public HasMoneyState(SodaVendingMachine sodaVendingMachine) {
        this.sodaVendingMachine = sodaVendingMachine;
    }

    @Override
    public void insertMoney() {
        System.out.println("No need to insert another dollar bill");
    }

    @Override
    public void ejectMoney() {
        System.out.println("Returning your dollar");
        sodaVendingMachine.setState(sodaVendingMachine.getNoMoneyState());
    }

    @Override
    public void select() {
        System.out.println("Selected item");
        dispense();
        sodaVendingMachine.setState(sodaVendingMachine.getSoldState());
    }

    @Override
    public void dispense() {
        sodaVendingMachine.count--;
        System.out.println("Dispensing your soda!!");
    }

    @Override
    public String toString() {
        return "waiting for a new selection";
    }
}
