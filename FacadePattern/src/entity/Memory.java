package entity;

public class Memory {
    public void load(long position, byte[] data) {
        System.out.println("loaded item to memory in position " + position);
    }
}
