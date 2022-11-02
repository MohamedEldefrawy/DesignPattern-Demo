package model;

import contract.IceCream;

public class BasicIceCream implements IceCream {

    public BasicIceCream() {
        System.out.println("Creating basic ice cream");
    }

    @Override
    public Double cost() {
        return 0.5;
    }
}
