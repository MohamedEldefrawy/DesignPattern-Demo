import contract.Bank;
import proxy.ProxyBank;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Bank bank = new ProxyBank();
        bank.withdrawy("Ahmed");
    }
}