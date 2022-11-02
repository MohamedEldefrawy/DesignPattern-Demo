package model;

// Receiver class
public class PlayerCharacter {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void jump() {
        System.out.println(this.name + " Jumping");
    }

    public void moveLeft() {
        System.out.println(this.name + " Moving left");
    }

    public void moveRight() {
        System.out.println(this.name + " Moving right");
    }

    public void crouch() {
        System.out.println(this.name + " Crouching");
    }
}
