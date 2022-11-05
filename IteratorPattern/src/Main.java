import entity.Product;
import iterator.BookStoreIterator;
import iterator.Iterator;
import iterator.VideoGameIterator;
import store.BookStore;
import store.VideoGameStore;

public class Main {
    public static void main(String[] args) {
        BookStore bookStore = new BookStore("Kotb");
        VideoGameStore gameStore = new VideoGameStore("games");

        Iterator books = new BookStoreIterator(bookStore.getProducts());
        Iterator games = new VideoGameIterator(gameStore.getProducts());

        while (books.hasNext()) {
            Product product = (Product) books.next();
            System.out.println(product.getName() + ": " + product.getPrice());
        }

        while (games.hasNext()) {
            Product product = (Product) games.next();
            System.out.println(product.getName() + ": " + product.getPrice());
        }
    }
}