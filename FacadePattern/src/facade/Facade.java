package facade;

import entity.Cpu;
import entity.HardDrive;
import entity.Memory;

public class Facade {
    private Cpu cpu;
    private HardDrive hardDrive;
    private Memory memory;

    public Facade(Cpu cpu, HardDrive hardDrive, Memory memory) {
        this.cpu = cpu;
        this.hardDrive = hardDrive;
        this.memory = memory;
    }

    public void start() {
        cpu.freeze();
        memory.load(123, hardDrive.read(123, 22));
        cpu.jump(123);
        cpu.execute();
    }
}
