package store;

import contract.Burger;
import model.BurgerType;

public abstract class BurgerStore {

    private String name;

    public Burger orderBurger(BurgerType type) {
        Burger createdBurger = createBurger(type);
        createdBurger.prepare();
        createdBurger.cook();
        createdBurger.box();
        return createdBurger;
    }

    public abstract Burger createBurger(BurgerType type);
}
