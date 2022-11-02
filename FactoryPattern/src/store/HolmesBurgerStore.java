package store;

import contract.Burger;
import model.BurgerType;
import model.HolmesBeefBurger;
import model.HolmesCheeseBurger;

public class HolmesBurgerStore extends BurgerStore {
    @Override
    public Burger createBurger(BurgerType type) {
        Burger createdBurger;
        switch (type) {
            case BEEF -> createdBurger = new HolmesBeefBurger();
            case CHEESE -> createdBurger = new HolmesCheeseBurger();
            default -> createdBurger = null;
        }
        return createdBurger;
    }
}
