package State.solutionStatePattern;

import State.solutionStatePattern.model.SodaVendingMachine;

public class Main {
    public static void main(String[] args) {
        SodaVendingMachine sodaVendingMachine = new SodaVendingMachine(10);
        System.out.println(sodaVendingMachine);
        sodaVendingMachine.insertMoney();
        sodaVendingMachine.selectSoda();
        sodaVendingMachine.dispense();
        System.out.println(sodaVendingMachine);
        sodaVendingMachine.insertMoney();
        sodaVendingMachine.selectSoda();
        sodaVendingMachine.dispense();
        System.out.println(sodaVendingMachine);
        sodaVendingMachine.insertMoney();
        sodaVendingMachine.selectSoda();
        sodaVendingMachine.dispense();

        System.out.println(sodaVendingMachine);

    }
}
