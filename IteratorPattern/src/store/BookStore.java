package store;

import entity.Product;

public class BookStore {
    private String name;
    private Product[] products = new Product[2];

    public BookStore(String name) {
        this.name = name;
        initStore();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    private void initStore() {

        Product book1 = new Product("Spiderman", 120d);
        Product book2 = new Product("Superman", 120d);

        this.products[0] = book1;
        this.products[1] = book2;
    }
}
