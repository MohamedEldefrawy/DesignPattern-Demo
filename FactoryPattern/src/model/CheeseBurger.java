package model;

import contract.Burger;

public class CheeseBurger implements Burger {
    private Double cost = 55d;

    public CheeseBurger() {
    }

    public CheeseBurger(Double cost) {
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
        return this.cost + 0.14 * this.cost;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing..");
    }

    @Override
    public void cook() {
        System.out.println("Cooking..");
    }

    @Override
    public void box() {
        System.out.println("Boxing..");
    }
}
