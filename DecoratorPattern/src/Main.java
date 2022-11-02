import contract.IceCream;
import model.BasicIceCream;
import model.ChocolateIceCream;
import model.VanillaIceCream;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        IceCream basicIceCream = new BasicIceCream();
        IceCream vanillaIceCream = new VanillaIceCream(basicIceCream);
        IceCream chocolateIceCream = new ChocolateIceCream(basicIceCream);
        IceCream chocoVanillaIceCream = new ChocolateIceCream(vanillaIceCream);

        System.out.println(basicIceCream.cost());
        System.out.println(vanillaIceCream.cost());
        System.out.println(chocolateIceCream.cost());
        System.out.println(chocoVanillaIceCream.cost());
    }
}