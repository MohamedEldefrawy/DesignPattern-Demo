import entity.Cpu;
import entity.HardDrive;
import entity.Memory;
import facade.Facade;

public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade(new Cpu(), new HardDrive(), new Memory());
        facade.start();
    }
}