import command.PlayerCharacterCrouchCommand;
import command.PlayerCharacterMoveLeftCommand;
import command.PlayerCharacterMoveRight;
import command.PlayerCharacterUpCommand;
import model.GameConsole;
import model.PlayerCharacter;

public class Main {
    public static void main(String[] args) {
        PlayerCharacter playerCharacter = new PlayerCharacter();
        playerCharacter.setName("Dafro");

        PlayerCharacterUpCommand playerCharacterUpCommand = new PlayerCharacterUpCommand(playerCharacter);
        PlayerCharacterCrouchCommand playerCharacterCrouchCommand = new PlayerCharacterCrouchCommand(playerCharacter);
        PlayerCharacterMoveLeftCommand playerCharacterMoveLeftCommand = new PlayerCharacterMoveLeftCommand(playerCharacter);
        PlayerCharacterMoveRight playerCharacterMoveRight = new PlayerCharacterMoveRight(playerCharacter);
        GameConsole gameConsole = new GameConsole(playerCharacterUpCommand, playerCharacterCrouchCommand, playerCharacterMoveLeftCommand, playerCharacterMoveRight);
        gameConsole.arrowRight();
        gameConsole.arrowUp();
        gameConsole.arrowLeft();
        gameConsole.arrowDown();
    }
}