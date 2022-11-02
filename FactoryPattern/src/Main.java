import contract.Burger;
import model.BurgerType;
import store.BurgerStore;
import store.HolmesBurgerStore;
import store.ZacksBurgerStore;

public class Main {
    public static void main(String[] args) {

        BurgerStore zacks = new ZacksBurgerStore();
        BurgerStore holmes = new HolmesBurgerStore();

        Burger burger = zacks.orderBurger(BurgerType.CHEESE);

        burger = holmes.orderBurger(BurgerType.BEEF);


    }
}