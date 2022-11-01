package payment.strategy;

import payment.strategy.Payment;

public class PayPalAlgorithm implements Payment {
    @Override
    public void pay(Double amount) {
        System.out.println("paying using PayPal amount: " + amount);
    }
}
