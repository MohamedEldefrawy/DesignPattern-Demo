package model;

import contract.Burger;

public class ZacksCheeseBurger implements Burger {

    @Override
    public Double calculateCost() {
        return 115d;
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
