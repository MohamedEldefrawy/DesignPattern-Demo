package payment.model;

import payment.strategy.Payment;

import java.util.List;

public class ShoppingCart {
    private List<Product> products;

    public ShoppingCart(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public boolean addToCart(Product product) {
        return this.products.add(product);
    }

    public boolean removeFromCart(Product product) {
        return this.products.remove(product);
    }

    public void pay(Payment payment) {
        Double total = calculateCost();
        payment.pay(total);
    }

    public Double calculateCost() {
        Double sum = 0d;
        for (Product product : products
        ) {
            sum += product.getPrice();
        }
        return sum;
    }
}
