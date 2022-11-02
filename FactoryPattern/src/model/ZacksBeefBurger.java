package model;

import contract.Burger;

public class ZacksBeefBurger implements Burger {
    @Override
    public Double calculateCost() {
        return 110d;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Zacks Special cheese burger..");
    }

    @Override
    public void cook() {
        System.out.println("Cooking Zacks Special cheese burger..");

    }

    @Override
    public void box() {
        System.out.println("Boxing Zacks Special beef burger..");
    }

}
