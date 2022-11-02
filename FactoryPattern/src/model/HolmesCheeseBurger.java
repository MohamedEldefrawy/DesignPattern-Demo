package model;

import contract.Burger;

public class HolmesCheeseBurger implements Burger {
    @Override
    public Double calculateCost() {
        return 100d;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Holmes Special cheese burger..");
    }

    @Override
    public void cook() {
        System.out.println("Cooking Holmes Special cheese burger..");

    }

    @Override
    public void box() {
        System.out.println("Boxing Holmes Special cheese burger..");
    }
}
