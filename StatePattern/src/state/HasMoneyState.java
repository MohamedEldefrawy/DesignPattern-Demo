package state;

import entity.SodaVendingMachine;

public class HasMoneyState implements State {
    private SodaVendingMachine sodaVendingMachine;

    public HasMoneyState(SodaVendingMachine sodaVendingMachine) {
        this.sodaVendingMachine = sodaVendingMachine;
    }

    @Override
    public void insertDollar() {
        System.out.println("Already inserted 1 dollar");
    }

    @Override
    public void ejectDollar() {
        System.out.println("Dollar has been ejected");
    }

    @Override
    public void selectSoda() {
        System.out.println("Please select your soda");
    }

    @Override
    public int dispense() {
        System.out.println("Please select your soda first");
        return this.sodaVendingMachine.getCount();
    }
}
