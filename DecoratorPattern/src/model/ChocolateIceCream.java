package model;

import contract.IceCream;
import decorator.IceCreamDecorator;

public class ChocolateIceCream extends IceCreamDecorator {
    public ChocolateIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public Double cost() {
        System.out.println("Adding Chocolate");
        return 1.0 + super.cost();
    }
}
