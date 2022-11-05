package store;

import entity.Product;

import java.util.ArrayList;
import java.util.List;

public class VideoGameStore {
    private String name;
    private List<Product> products;

    public VideoGameStore(String name) {
        this.name = name;
        this.products = new ArrayList<>();
        initStore();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    private void initStore() {
        Product game1 = new Product("Max Payne", 120d);
        Product game2 = new Product("God Of War", 120d);
        this.products.add(game1);
        this.products.add(game2);
    }
}
