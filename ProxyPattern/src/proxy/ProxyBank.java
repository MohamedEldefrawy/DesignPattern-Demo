package proxy;

import contract.Bank;
import entity.RealBank;

public class ProxyBank implements Bank {
    Bank realBank = new RealBank();

    @Override
    public void withdrawy(String clientName) {
        System.out.println("requesting Withdraw operation...");
        realBank.withdrawy(clientName);
    }
}
