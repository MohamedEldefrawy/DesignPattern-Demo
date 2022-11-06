package state;

import entity.SodaVendingMachine;

public class SoldOutState implements State {

    private SodaVendingMachine sodaVendingMachine;

    public SoldOutState(SodaVendingMachine sodaVendingMachine) {
        this.sodaVendingMachine = sodaVendingMachine;
    }

    @Override
    public void insertDollar() {
        System.out.println("");
    }

    @Override
    public void ejectDollar() {
        System.out.println("The machine is sold out");
    }

    @Override
    public void selectSoda() {
        System.out.println("The machine is sold out");
    }

    @Override
    public int dispense() {
        System.out.println("The machine is sold out");
        return this.sodaVendingMachine.getCount();
    }
}
