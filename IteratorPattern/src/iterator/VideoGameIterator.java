package iterator;

import entity.Product;

import java.util.List;

public class VideoGameIterator implements Iterator {
    private List<Product> products;
    private int index;

    public VideoGameIterator(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public boolean hasNext() {
        if (this.products.size() > index)
            return true;
        return false;
    }

    @Override
    public Object next() {
        return this.products.get(index++);
    }
}
