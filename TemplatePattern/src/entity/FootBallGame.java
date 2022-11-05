package entity;

import template.Game;

public class FootBallGame extends Game {
    @Override
    public void initialize() {
        System.out.println("Initializing Football game");
    }

    @Override
    public void start() {
        System.out.println("Starting Football game");
    }

    @Override
    public void end() {
        System.out.println("Ending Football game");
    }

    @Override
    public void addingNewCharacter() {

    }
}
