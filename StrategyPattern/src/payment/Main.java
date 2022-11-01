package payment;

import payment.model.Product;
import payment.model.ShoppingCart;
import payment.strategy.CreditCardAlgorithm;
import payment.strategy.PayPalAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Chipsy", 25d));
        products.add(new Product("Pepsi", 12.5));
        ShoppingCart shoppingCart = new ShoppingCart(products);

        shoppingCart.pay(new CreditCardAlgorithm());
        shoppingCart.pay(new PayPalAlgorithm());
    }
}
