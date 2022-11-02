package model;

import contract.IceCream;
import decorator.IceCreamDecorator;

public class VanillaIceCream extends IceCreamDecorator {
    public VanillaIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public Double cost() {
        System.out.println("Adding Vanilla");
        return 2.0 + super.cost();
    }
}
