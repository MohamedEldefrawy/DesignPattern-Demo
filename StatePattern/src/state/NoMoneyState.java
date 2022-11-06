package state;

import entity.SodaVendingMachine;

public class NoMoneyState implements State {
    private SodaVendingMachine sodaVendingMachine;

    public NoMoneyState(SodaVendingMachine sodaVendingMachine) {
        this.sodaVendingMachine = sodaVendingMachine;
    }

    @Override
    public void insertDollar() {
        System.out.println("Dollar has been inserted");
    }

    @Override
    public void ejectDollar() {
        System.out.println("Cannot eject, no money inserted");
    }

    @Override
    public void selectSoda() {
        System.out.println("Please insert money first");
    }

    @Override
    public int dispense() {
        System.out.println("Please insert money and select soda first");
        return this.sodaVendingMachine.getCount();
    }
}
