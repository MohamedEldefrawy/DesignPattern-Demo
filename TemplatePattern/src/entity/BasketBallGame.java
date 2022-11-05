package entity;

import template.Game;

public class BasketBallGame extends Game {
    @Override
    public void initialize() {
        System.out.println("Initializing Basketball game");
    }

    @Override
    public void start() {
        System.out.println("Starting Basketball game");
    }

    @Override
    public void end() {
        System.out.println("Ending Basketball game");
    }

    @Override
    public void addingNewCharacter() {

    }
}
