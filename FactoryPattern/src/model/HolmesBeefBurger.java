package model;

import contract.Burger;

public class HolmesBeefBurger implements Burger {
    @Override
    public Double calculateCost() {
        return 120d;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Holmes Special beef burger..");
    }

    @Override
    public void cook() {
        System.out.println("Cooking Holmes Special beef burger..");

    }

    @Override
    public void box() {
        System.out.println("Boxing Holmes Special beef burger..");
    }
}
