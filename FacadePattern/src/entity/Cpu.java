package entity;

public class Cpu {

    public void freeze() {
        System.out.println("CPU Freezing..");
    }

    public void jump(long position) {
        System.out.println("Jumping to : " + position);
    }

    public void execute() {
        System.out.println("Executing commands..");
    }
}
