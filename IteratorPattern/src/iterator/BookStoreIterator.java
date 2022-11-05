package iterator;

import entity.Product;

public class BookStoreIterator implements Iterator {
    private Product[] products;
    private int index = 0;

    public BookStoreIterator(Product[] products) {
        this.products = products;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    @Override
    public boolean hasNext() {
        if (products.length  > index)
            return true;
        return false;
    }

    @Override
    public Object next() {
        return products[index++];
    }
}
