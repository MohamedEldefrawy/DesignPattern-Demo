package model;

import contract.Command;

// Invoker class
public class GameConsole {
    private Command up;
    private Command down;
    private Command left;
    private Command right;

    public GameConsole(Command up, Command down, Command left, Command right) {
        this.up = up;
        this.down = down;
        this.left = left;
        this.right = right;
    }

    public void arrowUp() {
        this.up.execute();
    }

    public void arrowDown() {
        this.down.execute();
    }

    public void arrowLeft() {
        this.left.execute();
    }

    public void arrowRight() {
        this.right.execute();
    }
}
