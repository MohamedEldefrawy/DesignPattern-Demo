package state;

import entity.SodaVendingMachine;

public class SoldState implements State {
    private SodaVendingMachine sodaVendingMachine;

    public SoldState(SodaVendingMachine sodaVendingMachine) {
        this.sodaVendingMachine = sodaVendingMachine;
    }

    @Override
    public void insertDollar() {
        System.out.println("Please take your soda");

    }

    @Override
    public void ejectDollar() {
        System.out.println("Your soda is ready please take it");
    }

    @Override
    public void selectSoda() {
        System.out.println("Your soda is ready please take it");
    }

    @Override
    public int dispense() {
        System.out.println("Your soda is ready please take it");
        return this.sodaVendingMachine.getCount() - 1;
    }
}
