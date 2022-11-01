package payment.strategy;

import payment.strategy.Payment;

public class CreditCardAlgorithm implements Payment {

    @Override
    public void pay(Double amount) {
        System.out.println("Paying using Credit Card amount: " + amount);
    }
}
