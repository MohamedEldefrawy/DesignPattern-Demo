package entity;

import contract.Bank;

public class RealBank implements Bank {
    @Override
    public void withdrawy(String clientName) {
        System.out.println("Withdrawing done...");
    }
}
