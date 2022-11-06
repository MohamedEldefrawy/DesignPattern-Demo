package entity;

import state.*;

public class SodaVendingMachine {
    private State hasMoney;
    private State noMoney;
    private State soldOut;
    private State sold;

    private State currentState;
    private int count;

    public SodaVendingMachine(int count) {
        soldOut = new SoldOutState(this);
        hasMoney = new HasMoneyState(this);
        noMoney = new NoMoneyState(this);
        sold = new SoldState(this);
        this.count = count;
        this.currentState = noMoney;
    }

    // Actions
    public void insertMoney() {
        this.currentState.insertDollar();
        this.currentState = hasMoney;
    }

    public void ejectMoney() {
        this.currentState.ejectDollar();
        this.currentState = noMoney;
    }

    public void selectSoda() {
        this.currentState.selectSoda();
        this.currentState = sold;
    }

    public void dispense() {
        this.count = this.currentState.dispense();
        this.currentState = soldOut;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
