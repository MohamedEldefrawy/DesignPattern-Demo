package model;

import contract.Burger;

public class BeefBurger implements Burger {
    private Double cost = 65d;

    public BeefBurger() {
    }

    public BeefBurger(Double cost) {
        this.cost = cost;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    @Override
    public Double calculateCost() {
        return this.cost + 0.14 * cost;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing..");
    }

    @Override
    public void cook() {
        System.out.println("Cooking...");
    }

    @Override
    public void box() {
        System.out.println("Boxing...");
    }
}
