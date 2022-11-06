import entity.SodaVendingMachine;

public class Main {
    public static void main(String[] args) {
        SodaVendingMachine sodaVendingMachine = new SodaVendingMachine(10);
        sodaVendingMachine.insertMoney();
        sodaVendingMachine.selectSoda();
        sodaVendingMachine.dispense();
        System.out.println("Soda cans: " + sodaVendingMachine.getCount());
        System.out.println("=========");
        sodaVendingMachine.insertMoney();
        sodaVendingMachine.selectSoda();
        sodaVendingMachine.dispense();
        System.out.println("Soda cans: " + sodaVendingMachine.getCount());
    }
}