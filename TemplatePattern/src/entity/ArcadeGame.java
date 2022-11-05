package entity;

import template.Game;

import java.util.Scanner;

public class ArcadeGame extends Game {
    @Override
    public void initialize() {
        System.out.println("Initializing Arcade Game");
    }

    @Override
    public void start() {
        System.out.println("Starting Arcade Game");
    }

    @Override
    public void end() {
        System.out.println("Ending Arcade Game");
    }

    @Override
    public void addingNewCharacter() {
        String userInput = getUserInput();
        switch (userInput.toLowerCase()) {
            case "y" -> System.out.println("New character has been added to Arcade Game");
            default -> System.out.println("No character has been added");
        }
    }

    private String getUserInput() {
        System.out.println("Would you add new character to the game (y/n) ?");
        return new Scanner(System.in).nextLine();
    }
}
