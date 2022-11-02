package store;

import contract.Burger;
import model.BurgerType;
import model.ZacksBeefBurger;
import model.ZacksCheeseBurger;

public class ZacksBurgerStore extends BurgerStore {
    @Override
    public Burger createBurger(BurgerType type) {
        Burger createdBurger;
        switch (type) {
            case BEEF -> createdBurger = new ZacksBeefBurger();
            case CHEESE -> createdBurger = new ZacksCheeseBurger();
            default -> createdBurger = null;
        }
        return createdBurger;
    }
}
