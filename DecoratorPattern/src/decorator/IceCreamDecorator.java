package decorator;

import contract.IceCream;

public class IceCreamDecorator implements IceCream {
    private IceCream iceCream;

    public IceCreamDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public Double cost() {
        return this.iceCream.cost();
    }
}
